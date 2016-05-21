# AppDirectTest

<p>Welcome to the Unfinshed App Direct Integration Test App!(and my first Java Spring App)</p>
<h2>Instalation:</h2>
<ul>
<li>1. In servlet file add the path to your database</li>
<li>and create database schemas:
<p>create table subscriptions(id varchar(40) primary key, company_name varchar(80), status varchar(40), edition varchar(40));
</p>
<p>create table users(id varchar(40) primary key, email varchar(80), open_id varchar(100), subscription_id varchar(40));
</p>
</li>
<li>2. mvn package will create a .war file</li>
<li>3. drop it in the tomcat folder</li>
<li>4. you can send it mock requests with the data from AppDirect api and test it
I tested it with https://www.mockable.io/</li>
</ul>
<h2>What it does:</h2>
<p>Create and cancel subscription!</p>
<h2>What is planned:</h2>
<ul>
<li>1. Add oAuth</li>
<li>2. Add more checks for database queries</li>
<li>3. Really add more checks</li>
<li>4. Assign and unassign users</li>
<li>5. Maybe try Hibernate or other database mapping thingy, I was interested to do it manually for the 
first time</li>
<li>6. And, for the love of god, do normal error messages</li>
<li>7. Unit tests are missing too</li>
</ul>
