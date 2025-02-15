HW2 Final Submission

Folder Structure:
-----------------
HW2_Project/
├── src/
│   ├── HW2.java           # Java file with CRUD operations for Questions and Answers
│   ├── HW2Test.java       # JUnit test cases to verify CRUD operations
│   ├── Main.java          # Java file to manually test CRUD operations in the console

Instructions:
-------------
1. Extract the HW2_Project.zip file.
2. Open the project in Eclipse, IntelliJ, or VS Code.
3. Ensure JUnit 5 is installed:
   - Eclipse: Right-click project > Build Path > Add Libraries > JUnit 5.
   - IntelliJ: File > Project Structure > Libraries > Add JUnit 5 from Maven.

Running HW2:
------------
1. Run Main.java to manually test CRUD operations:
   - Right-click Main.java > Run As > Java Application (Eclipse)
   - Click Run Main.java (IntelliJ)
   - Command Line: javac Main.java && java Main

2. Run HW2Test.java to verify JUnit tests:
   - Right-click HW2Test.java > Run As > JUnit Test (Eclipse)
   - Click Run HW2Test.java (IntelliJ)
   - Command Line: javac -cp .;junit-5.8.1.jar HW2Test.java && java -jar junit-platform-console-standalone-1.8.1.jar --class-path . --select-class HW2Test

Expected Output:
----------------
- Main.java will display:
  * All questions stored in the system
  * Search results for a keyword
  * Answers linked to a question
  * Updated questions and answers
  * Deleted questions not appearing in the final list

- HW2Test.java will show a green bar indicating all test cases passed.

Final Steps:
------------
1. Record a screencast:
   - Show the test results (JUnit running successfully).
   - Run Main.java to demonstrate CRUD operations.
   - Briefly explain the output.
2. Upload the screencast and submit the HW2 report on Canvas.

