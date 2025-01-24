<h1 align="center">Journal App 📓</h1>

<p>A simple and intuitive journal application built with Spring Boot. This project allows users to create, view, edit, and delete journal entries. </p>

<h2>Features</h2>
<ul>
  <li>🔒 <strong>User Authentication and Authorization</strong></li>
  <li>✍️ <strong>Create, Read, Update, and Delete (CRUD) Journal Entries</strong></li>
  <li>🕒 <strong>Timestamped Entries for Easy Tracking</strong></li>
</ul>

<h2>Tech Stack</h2>
<ul>
  <li><strong>Backend:</strong> Spring Boot, Spring Security, Hibernate, JPA</li>
  <li><strong>Database:</strong> MongoDB</li>
  <li><strong>Build Tools:</strong> Maven</li>
</ul>

<h2>Configuration</h2>
<p>To run the application, you need to specify your MongoDB connection URI in the <code>application.properties</code> file:</p>

<pre>
spring.data.mongodb.uri=mongodb+srv://&lt;username&gt;:&lt;password&gt;@&lt;cluster-url&gt;/?retryWrites=true&w=majority
</pre>

<p>Replace <code>&lt;username&gt;</code>, <code>&lt;password&gt;</code>, <code>&lt;cluster-url&gt;</code>  with your MongoDB credentials.</p>

<p align="center">Feel free to clone and customize the app for your journaling needs! 🚀</p>
