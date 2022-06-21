# 1. Phone book (HashMap)

## Description
One contact can below to several groups. For example, if you work with your friend, he will be in two groups - "Friends" and "Job".
It should be possible to create groups and contacts, add one contact to several groups. 

## The functionality of the program
* Creating a contact group
* Creating a contact
* Adding a contact to different groups
* Search for contacts by group
* Search for a contact by number

# 2. List of Student (HashSet)

## Description
I have developed a student accounting system. For each student we need to store: *full name, group number, student ID number*. The unique identifier is the 
*student ID number*. The user enters student data in an infinite loop before entering the "end" command. At the end of the input, the program should output 
a list of students. The data structure where students are saved should discard the input of a student with an id already existing in the database and write 
about it to the user. Keep in mind that people's names may be the same, but the document numbers are not.

## The functionality of the program
* Entering information about students
* Output of the list of students

## Example
```
Enter information about student: "full name, group number, student ID number"
Jane Doe, 1243-B, 31231343 <enter>
Enter information about student (to end the program, enter "end")
John Doe, 1243-B, 43221343 <enter>
Enter information about student (to end the program, enter "end")
end <enter>
List of students:
  - Jane Doy, 1243-B, 31231343
  - John Doe, 1243-B, 43221343
```

# 3. Notebook (Lists)

## Description
The program is a to-do list manager.

## The functionality of the program
* Requesting a list of tasks/to-do from the user
* Ability to add a task to the list
* Ability to delete a task from the list
* The ability to display all tasks with their numbers (for the user to number from 1)

## Example
```
Select an action:
1. Add a task
2. Display a list of tasks
3. Delete the task
0. Exit
1 <enter>
Enter a task for planning:
Read about ArrayList

Select an action:
1. Add a task
2. Display a list of tasks
3. Delete the task
0. Exit
1 <enter>
Enter a task for planning:
Repeat primitive data types

Select an action:
1. Add a task
2. Display a list of tasks
3. Delete the task
0. Exit
2 <enter>
Task list:
1. Read about ArrayList
2. Repeat primitive data types

Select an action:
1. Add a task
2. Display a list of tasks
3. Delete the task
0. Exit
0 <enter>
```

# 4. Missing calls (TreeMap)

## Description
The program stores a list of missing calls in format: ```date and time``` of the call and ```number```.

A missed call is described by the time and number (not the contact).

## The functionality of the program
* Storing a list of missed calls
* In the class of the list of missed calls, a method is implemented that accepts the phone book and displays all missed calls in the order in which they were received, 
while for numbers for which there is a contact, the caller's name, not the number, should be displayed on the screen.

# 5. Candidate selection system (TreeSet)

## Description
It is necessary to store candidates in such a way that they are sorted in descending order, by two fields at the same time — by the relevance of the resume and by the assessment at the interview (i.e., among two candidates, preference is given to the one with the higher relevance of the resume, and among equals in this parameter to the one with the higher assessment at the interview).

## The functionality of the program
* The class describing the candidate
* Create a set, fill it with candidates
* Output of candidates in sorted order

