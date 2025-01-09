package com.deep.journalApp.service;

import com.deep.journalApp.entity.JournalEntry;
import com.deep.journalApp.entity.User;
import com.deep.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    @Autowired UserService userService;

    @Transactional
    public void saveEntry(JournalEntry journalEntry, String username){
        try{
            User user = userService.findByUsername(username);
            journalEntry.setDate(LocalDateTime.now());
            JournalEntry saved = journalEntryRepository.save(journalEntry);
            user.getJournal_entries().add(saved);
            userService.saveEntry(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("An error occurred while saving journal entry", e);
        }

    }

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId id){
        return journalEntryRepository.findById(id);
    }

    public void deleteById(ObjectId id, String username) {
        User user = userService.findByUsername(username);
        user.getJournal_entries().removeIf(journalEntry -> journalEntry.getId().equals(id));
        userService.saveEntry(user);
        journalEntryRepository.deleteById(id);
    }
}
