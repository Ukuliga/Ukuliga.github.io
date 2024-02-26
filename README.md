#Welcome to My GitHub Page!
# Paul Stephan's CS499 Final Portfolio

In my ePortfolio I am going to demostrate my proficiency in the 5 outcomes taurgettedl in the computer science program. The goal is to create a holistic view of my progress and show the importance of each aspect through exploring 3 different artifacts. 

## Table of Contents

- [Professional Reflection](#professional-reflection)
- [Artifact 1 Appointment Scheduling](#artifact-1-appointment-scheduling)
- [Artifact 2 Student Program Use Cases](#artifact-2-student-program-use-cases)
- [Artifact 3 Database Collaberation](#artifact-3-database-collaberation)
- [Code review Video](#video)

## Professional Reflection
[Professional Reflection](CS499%20Professional%20reflection.docx)

Reflecting on my journey through the Computer Science program and the completion of my capstone project, I find myself deeply appreciative of the transformative experience it has been. This journey has not only equipped me with technical skills but has also shaped my professional identity and readiness to navigate the dynamic landscape of computer science.

Throughout the program, I've encountered diverse challenges and opportunities that have refined my strengths and values. Collaborative projects have underscored the importance of effective teamwork and communication. From group assignments to team-based projects, I've learned to leverage the unique perspectives of my peers, contributing to collective success while fostering a collaborative spirit.

Communication, both verbal and written, has emerged as a crucial pillar of my professional development. Whether presenting project proposals or engaging in discussions, I've honed the art of articulating complex ideas with clarity and precision. These experiences have endowed me with the confidence to interact with stakeholders across various organizational levels.

My three enhancements I have used for this course demonstrate my wide mastery of different computer science areas.

Mastery in thoroughly testing reflects my commitment to software reliability and quality. By designing and executing meticulous test cases, I've ensured the robustness of software solutions, demonstrating my attention to detail and dedication to excellence.

Crafting an algorithm for student course selection was a pivotal project. It showcased my prowess in data structures and algorithms, as I devised a solution optimizing course selection based on student attributes and program requirements. Through rigorous testing and refinement, I empowered students to make informed academic decisions.

Creating an animal shelter program using a NoSQL database underscored my expertise in software engineering and database management. From designing schemas to implementing data manipulation functionalities, I developed scalable solutions optimizing shelter operations and animal records management.

As I embark on the next phase of my journey, my ePortfolio stands as a testament to my growth and readiness to contribute meaningfully to the field of computer science. Each artifact within the portfolio reflects a unique facet of my technical proficiency and problem-solving acumen.

In summary, my professional self-assessment encapsulates my journey, highlighting my strengths, values, and readiness to navigate the complexities of the computer science landscape. Armed with diverse experiences and a steadfast commitment to excellence, I am poised to make impactful contributions and embrace new challenges with vigor and enthusiasm.


## Artifact 1 Appointment Scheduling

This artifact was done in CS320. It is an app that schedules appointments, makes contacts, and tasks for a system. It also has a set of JUnit tests made to test the program for functionality. 

This artifact showcases many of the skills I am trying to present in my portfolio. Firstly I want to demonstrate my ability to develop quality code that is made to complete industry-specific goals. The program is set up to ensure the goals of the end users are met. Next I want to show that I am using a mindset to mitigate design flaws, expose potential vulnerabilities and ensure security. Lastly I want to show that I am developing in an environment that shows clear communication adapted to the audience I am working with. Improving the artifact I took the original code and added additional services in the appointment class. Originally it only had add and delete appointments, but I added an update function. This allows the users to make changes to the appointment without completely removing and adding a new one. Additionally I added some more descriptive error messages because when troubleshooting I kept receiving an invalid date error and could not find the issue. Eventually I found the JUnit test was using a date in 2021 to make an appointment, which obviously could not occur since it is now 2023. To mitigate issues like that in the future I added the descriptive error messages.

I believe I met the course objectives, but if I did not I will certainly improve the artifact further before the final submission. I have not updated the outcome coverage yet. I found the process of improving the artifact very rewarding. I have learned many coding skills since making the artifact, especially in the areas around the code such as working inside an IDE and how the different classes interact with object oriented languages. Since that process is much smoother since originally creating this code I could focus more on the actual functionality and code to make this as robust and useful as possible. 





## Artifact 2 Student Program Use Cases

The artifact I chose for this Milestone was the IT315 Use Case diagram. I initially made it in 2022. I chose this inclusion because it displays many of the outcomes the course is working towards. Specifically, “Design and evaluate computing solutions that solve a given problem using algorithmic principles and computer science practices and standards appropriate to its solution, while managing the trade-offs involved in design choices (data structures and algorithms)”, “Design, develop, and deliver professional-quality oral, written, and visual communications that are coherent, technically sound, and appropriately adapted to specific audiences and contexts”, and “Demonstrate an ability to use well-founded and innovative techniques, skills, and tools in computing practices for the purpose of implementing computer solutions that deliver value and accomplish industry-specific goals (software engineering/design/database)”.

This artifact is good to display my ability to provide value in developing software with specific goals, and apply to specific audiences. The original artifact was only a diagram with the plan for use cases and the relations between them and the users. I improved it by adding additional use cases that will help provide value and adapting them into specific goals and benefits. I also coded it in Java and made JUnit tests to verify the functionality and use of the code. Once it was coded I ensured I commented inside the code and provided a header. The next objective I focused on was making an algorithm that computes a solution with O(n) timing restrictions. This is demonstrated through a search through the programs offered by the school and comparing the hours, courses, and other requirements to the students attributes. Once they are compared it then checks if the program is closer to being completed than the previously best program. When that is done it returns the best option for a student to pursue. In the scenario where a student has all the requirements for a program it will return all programs they meet the requirements to complete. 

Enhancing this artifact was very good for me to focus on converting a plan I had previously made into functional code. It had been such a long time that I had not recalled much of the goals when first making the Use Case diagram that it might as well have been from a different developer. My main challenge was making the tests check what was needed and having the data entered into the system to test the system with different options.

## Artifact 3 Database Collaberation

I chose the README and mongoDB from CS340 for my third artifact. I made this in August of 2023, so fairly recently compared to my other artifacts. It demonstrates many of the outcomes for CS499. The main two I wanted to target were “Develop a security mindset that anticipates adversarial exploits in software architecture and designs to expose potential vulnerabilities, mitigate design flaws, and ensure privacy and enhanced security of data and resources” and “Employ strategies for building collaborative environments that enable diverse audiences to support organizational decision making in the field of computer science”.

I chose to include this artifact to display both of these features. When I made the MongoDB instance on my computer I ensured access control was enabled and users needed to be added by the admin and have a secure password to access any of the data. I built the documents to have a consistent data structure that helps them relate between the collections to ensure clear relations between them. In order to improve the artifact I expanded on the functions to include some additional analysis and more complicated documents that have specific goals. The original code did basic CRUD functions, but the new one takes inputs and organizes them to ensure it fits the data structure and schema of the rest of the data. 
 
I believe these changes are good to show that I have grown in coding and data manipulation. Showing that I can make the environment both collaborative and secure to work together is growth from the original work.

Enhancing this was a fun process for me. I work with databases and analysis like this in my career and enjoy learning more and getting practice with these structures. The challenge I ran into for this artifact was trying to find what data aspects would be interesting to the workers and the users. When working I am much more productive when working towards a solid set of goals that are not just generic improvements that may or may not be useful to the end user. 




