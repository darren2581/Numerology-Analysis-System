## **Assessment: Introduction to Software Engineering (ISAD1000) Final Assignment**

### **Student name: Darren Tan Thong En**
### **Student ID: 21690848**
### **Campus: Curtin University Malaysia, Miri, Sarawak.**

<br><br>

### **Introduction**
This program is intended to identify the generation of the person by looking at the date of birth that has been inserted into the program and calculating the Life Path number with its identical lucky colour associated with the Life Path Number. This program performs the calculation and works well as needed to show the correct details for each date of birth.

<br>

---
### **Module Description**
#### Submodule: calculateLifePathNumber

Imports: day(string), month(string), year(string)

Exports: sum(int)

Description: This method calculates the initial sum of the digits in an individual's date of birth. The Life Path Number is derived from the sum of the digits in the day, month, and year of birth, which is then further processed to get the final Life Path Number. Value of day must be greater than 0 and not more than 31, month must be more than 0 and not more than 12, and year more than 1900 and not more than 2024 to be able to calculate a valid value for sum. If the condition is not met, return -1. The function considers specific master numbers (11, 22, 33) for the day and month, and adjusts the sum accordingly before returning it.

Input Method: Parameter passing

Output Method: Return value

Reasoning: This module calculates the sum of the digits in the date of birth, considering master numbers for day and month.

Modularity Principle: Single Responsibility, Reusability - Focuses on a single task, making it reusable wherever initial sum calculation is needed.

<br>

#### Submodule: reduceLifePathNumber

Imports: sum(int)

Exports: lifePathNumber(int)

Description: This method reduces a given sum to a single digit or one of the master numbers (11, 22, 33) to determine the Life Path Number. The value of sum must be a valid positive number to get the result from this function.

Input Method: Parameter passing

Output Method: Return value

Reasoning: By isolating the reduction logic, the code adheres to the principle of separation of concerns. 

Modularity Principle: Single Responsibility - This module focuses solely on reducing the sum to a single digit or master number.

<br>

#### Submodule: determineColor

Imports: pathNumber(int)

Exports: color(String)

Description: This module assigns a favorite color based on the Life Path Number. Each Life Path Number corresponds to a specific color. The value of pathNumber must be between 1-9 or is equal to 11, 22, 33. to show a valid output. If condition not met, the output shown will be "Invalid".

Input Method: Parameter passing

Output Method: Return string

Reasoning: By having a separate module for determining the color, the code adheres to the principle of separation of concerns. 

Modularity Principle: Single Responsibility - This module handles only the task of assigning a color based on the Life Path Number.

<br>

#### Submodule: Generations

Imports: year(string)

Exports: generation(String)

Description: This method classifies individuals into generational cohorts (e.g., Silent Generation, Baby Boomers based on their year of birth). Each cohort is associated with a specific range. The range of value for year will be between 1901 and 2024 to determine the generation. If condition not met, the program will output "Unknown Generation".

Input Method: Parameter passing

Output Method: Return string

Reasoning: This module is responsible for classifying individuals into generational cohorts based on their birth year. 

Modularity Principle: Single Responsibility, Reusability - It isolates the generation classification logic.

<br>


#### Submodule: writeToFile
Imports: name(string), day(string), month(string), year(string)

Exports: none 

Description: Writes a person's information (name, day, month, and year) to the text file "PersonDetails.txt". Each individual's information is recorded on a new line in the file.

Input Method: Parameter passing

Output Method: Write to file

Reasoning: This approach is designed to store people's information in a persistent manner. Storing data in a file allows the program to maintain the information even after it has been closed or resumed.

Modularity Principle: The technique adheres to the notion of modularity by isolating the functionality of writing data to a file in a single, reusable function. This makes the code easier to maintain and comprehend because the file-writing logic is segregated from the rest of the program logic.

<br>

#### Submodule: invalidDOB
Imports: day(int), month(int), year(int)

Exports: boolean

Description: Determines whether a given date of birth (day, month, and year) is valid or not where day is between 1-31, month is between 1-12 and year between 1901-2024. The module will return true when the date of birth is valid. Otherwise, the module will return false.

Input Method: Parameter passing

Output Method: Return boolean

Reasoning: Does Year Range Check, Month Range Check, and Day Range Check to see if it suits the criteria. 

Modularity Principle: Single Responsibility - The method follows the principle of modularity by breaking down the validation process into smaller, manageable parts.

<br>

#### Submodule: isNumeric
Imports: dob(string)

Export: boolean

Description: checks whether a given string is fully composed of numeric characters. It tries to convert the string to an integer. If successful, it returns true, indicating that the string is a number. If an exception occurs during parsing, the NumberFormatException is caught and returned false.

Input Method: Parameter passing

Output Method: Return boolean

Reasoning: Attempt to parse the provided string into an integer. If successful, it suggests that the string is entirely composed of numeric characters. If the parsing fails due to non-numeric characters, a NumberFormatException is raised it will returns false.

Modularity Principle: Single Responsibility: The method has a clear responsibility: to determine whether a given string is numeric.


<br>

---


### **Modularity**

| **Items** | **Checklist questions relate to modularity**              | **Yes / No** | **Description of the issue if 'No' is the answer** |
| :-------: | :-----------------------------------------------------------------------: | :---: | :------: |
| 1.        | Are global variables not being used?                                      | Yes   |          |
| 2.        | Is a control flag not being used?                                         | Yes   |          |
| 3.        | Do you pass less than 6 parameters in a function?                         | Yes   |          |
| 4.        | Are there not any duplicate code segments that do the same thing?         | Yes   |          |
| 5.        | Does each of the methods have at most one specific and well-defined task? | Yes   |          |
| 6.        | Does each method have a clear and specific purpose?                       | Yes   |          |

<br>

![Relative](Pic/A1.png)
- Option 'a' is chosen to get details on Life Path Number.
- Option for 1 person details has been chosen to input details for one person.
- The program will calculate and determine the Life Path Number details for one person according to the given date of birth.

<br><br>

![Relative](Pic/A2.png)
- Option 'a' is chosen to get details on Life Path Number.
- Option for 2 person details has been chosen to input details for two person.
- The program will calculate and determine the Life Path Number details for two person according to the given date of birth.

<br><br>

![Relative](Pic/B1.png)
- Option 'b' is chosen to get details on Generation according to year.
- Option for 1 person details has been chosen to input details for one person.
- The program will take the year from the date of birth and determine the generation cohort for one person according to the given date of birth.

<br><br>

![Relative](Pic/B2.png)
- Option 'b' is chosen to get details on Generation according to year.
- Option for 2 person details has been chosen to input details for two person.
- The program will take the year from the date of birth and determine the generation cohort for two person according to the given date of birth.

<br>

### **Modularity of program explanation**

- The modularity is achieved by dividing functionality into different ways. Each method performs a specific duty, adding to the overall functionality of the programme.
- Overall, the code has a modular design, with functionality effectively divided into discrete methods, each accountable for a specific and well-defined duty. This technique encourages code organisation, reuse, and simplicity of maintenance.

<br>

---
### **Test Design(Black Box)**
#### Submodule: calculateLifePathNumber
| **Category**                                     | **Test Data**                           | **Expected Result** |
| :----------------------------------------------: | :-------------------------------------: | :-----------------: |
| day<1 AND month<1 AND year<1901                  | day = "0", month = "0", year = "1870"   | sum = -1            |
| day>1 AND month<1 AND year<1901                  | day = "10", month = "0", year = "1899"  | sum = -1            |
| day<1 AND month>1 AND year<1901                  | day = "0", month = "5", year = "1890"   | sum = -1            |
| day<1 AND month>1 AND year<1901                  | day = "0", month = "0", year = "1950"   | sum = -1            |
| day>1 AND month>1 AND year<1901                  | day = "11", month = "5", year = "1880"  | sum = -1            |
| day>1 AND month<1 AND year>1901                  | day = "30", month = "0", year = "1960"  | sum = -1            |
| day<1 AND month>1 AND year>1901                  | day = "0", month = "9", year = "2000"   | sum = -1            |
| day>1 AND month>1 AND year>1901                  | day = "13", month = "11", year = "2004" | sum = 22            |
| day>31 AND month>12 AND year>2024                | day = "35", month = "15", year = "2004" | sum = -1            |
| 1<=day<=31 AND month<1 AND year<2024             | day = "30", month = "0", year = "1999"  | sum = -1            |
| day<1 AND 1<=month<=12 AND year<2024             | day = "0", month = "3", year = "1987"   | sum = -1            |
| day<1 AND month<1 AND 1901<=year<=2024           | day = "0", month = "0", year = "2007"   | sum = -1            |
| 1<=day<=31 AND 1<=month<=12 AND year<2024        | day = "25", month = "10", year = "2010" | sum = 11            |
| 1<=day<=31 AND month<1 AND 1901<=year<=2024      | day = "15", month = "0", year = "2023"  | sum = -1            |
| day<1 AND 1<=month<=12 AND 1901<=year<=2024      | day = "0", month = "2", year = "1999"   | sum = -1            |
| 1<=day<=31 AND month>1 AND year>2024             | day = "3", month = "6", year = "2030"   | sum = -1            |
| day>1 AND 1<=month<=12 AND year>2024             | day = "7", month = "9", year = "2027"   | sum = -1            |
| ay>1 AND month>1 AND 1901<=year<=2024            | day = "29", month = "5", year = "1991"  | sum = 36            |
| 1<=day<=31 AND 1<=month<=12 AND year>2024        | day = "2", month = "4", year = "2004"   | sum = 12            |
| 1<=day<=31 AND month>1 AND 1901<=year<=2024      | day = "28", month = "9", year = "1945"  | sum = 38            |
| day>1 AND 1<=month<=12 AND 1901<=year<=2024      | day = "5", month = "5", year = "1987"   | sum = 35            |
| 1<=day<=31 AND 1<=month<=12 AND 1901<=year<=2024 | day = "13", month = "11", year = "1987" | sum = 22            |

- Covers a wide range of inputs to ensure that the function works correctly under a variety of scenarios. This technique concentrates on input and output while ignoring the function's internal workings.

![Relative](Pic/TestCalLPN.png)
- Test cases works correctly and the last four digit and last name from student ID is added into the test case to see how it handles the output.

<br>

#### Submodule: reduceLifePathNumber
| **Category**  | **Test Data** | **Expected Result** |
| :-----------: | :-----------: | :-----------------: |
| sum < 1       | sum = 0       | lifePathNumber = -1 |
| 1 <= sum <= 9 | sum = 7       | lifePathNumber = 7  |
| sum > 9       | sum = 13      | lifePathNumber = 4  |
| sum = 11      | sum = 11      | lifePathNumber = 11 |
| sum = 22      | sum = 22      | lifePathNumber = 22 |
| sum = 33      | sum = 33      | lifePathNumber = 33 |

- Covers a variety of situations, verifying that the function successfully handles the logic for converting a sum to a life path number and dealing with master numbers.

![Relative](Pic/TestRedLPN.png)
- Test cases works coretly to reduce the life path number.

<br>

#### Submodule: determineColor
| **Category**         | **Test Data**   | **Expected Result** |
| :----------:         | :-------------: | :-----------------: |
| pathNumber = 1       | pathNumber = 1  | color = "Red"       |
| pathNumber = 2       | pathNumber = 2  | color = "Orange"    |
| pathNumber = 3       | pathNumber = 3  | color = "Yellow"    |
| pathNumber = 4       | pathNumber = 4  | color = "Green"     |
| pathNumber = 5       | pathNumber = 5  | color = "Sky Blue"  |
| pathNumber = 6       | pathNumber = 6  | color = "Indigo"    |
| pathNumber = 7       | pathNumber = 7  | color = "Violet"    |
| pathNumber = 8       | pathNumber = 8  | color = "Magneta"   |
| pathNumber = 9       | pathNumber = 9  | color = "Gold"      |
| pathNumber = 10      | pathNumber = 10 | color = "Invalid"   |
| pathNumber = 11      | pathNumber = 11 | color = "Silver"    |
| pathNumber = 22      | pathNumber = 22 | color = "White"     |
| pathNumber = 33      | pathNumber = 33 | color = "Crimson"   |
| pathNumber < 1       | pathNumber = 0  | color = "Invalid"   |
| 11 < pathNumber < 22 | pathNumber = 15 | color = "Invalid"   |
| 22 < pathNumber < 33 | pathNumber = 25 | color = "Invalid"   |
| 33 < pathNumber      | pathNumber = 35 | color = "Invalid"   |

- Covers all potential situations, confirming that the function accurately transfers pathNumber values to their associated colours and returns "Invalid" for values that are out of range.

![Relative](Pic/TestColour.png)
- Test cases works correctly without any error. The result of each cases is output too so that we can verify each cases is correct.

<br>

#### Submodule: Generations
| **Category**         | **Test Data**   | **Expected Result**                    |
| :------------------: | :-------------: | :------------------------------------: |
| year < 1901          | year = "1900"   | generation = "Unknown Generation"      |
| 1901 <= year <= 1945 | year = "1920"   | generation = "Silent Generation"       |
| 1946 <= year <= 1964 | year = "1955"   | generation = "Baby Boomers Generation" |
| 1965 <= year <= 1979 | year = "1970"   | generation = "Generation X"            |
| 1980 <= year <= 1994 | year = "1990"   | generation = "Millennials Generation"  |
| 1995 <= year <= 2009 | year = "2004"   | generation = "Generation Z"            |
| 2010 <= year <= 2024 | year = "2011"   | generation = "Generation Alpha"        |
| 2024 < year          | year = "1920"   | generation = "Unknown Generation"      |

- Covers all possible scenarios classifies a particular year into a single generational cohort. The test data and predicted outcomes are organised to validate the correct categorization depending on the year specified.

![Relative](Pic/TestGen.png)
- Test cases works correctly and each result of the test case is also output to the console.

<br>

#### Submodule: invalidDOB
| **Category**                               | **Test Data**                     | **Expected Result** |
| :----------------------------------------: | :-------------------------------: | :-----------------: |
| day < 1 AND month < 1 AND year <1901       | day = 0, month = 0, year = 1900   | true                |
| day >= 1 AND month < 1 AND year <1901      | day = 5, month = 0, year = 1900   | true                |
| day < 1 AND month >= 1 AND year <1901      | day = 0, month = 9, year = 1900   | true                |
| day < 1 AND month < 1 AND year >=1901      | day = 0, month = 0, year = 1988   | true                |
| day >= 1 AND month >= 1 AND year <1901     | day = 2, month = 7, year = 1900   | true                |
| day => 1 AND month < 1 AND year >=1901     | day = 15, month = 0, year = 1987  | true                |
| day < 1 AND month >= 1 AND year >= 1901    | day = 0, month = 9, year = 1903   | true                |
| day >= 1 AND month >= 1 AND year >= 1901   | day = 13, month = 11, year = 1987 | false               |
| day > 31 AND month > 12 AND year > 2024    | day = 50, month = 18, year = 2025 | true                |
| day <= 31 AND month > 12 AND year > 2024   | day = 27, month = 20, year = 2027 | true                |
| day > 31 AND month <= 12 AND year > 2024   | day = 40, month = 2, year = 2031  | true                |
| day > 31 AND month > 12 AND year <= 2024   | day = 34, month = 14, year = 2000 | true                |
| day <= 31 AND month <= 12 AND year > 2024  | day = 2, month = 4, year = 2033   | true                |
| day <= 31 AND month > 12 AND year <= 2024  | day = 13, month = 16, year = 1999 | true                |
| day > 31 AND month <= 12 AND year <= 2024  | day = 45, month = 9, year = 1962  | true                |
| day <= 31 AND month <= 12 AND year <= 2024 | day = 2, month = 4, year = 2004   | false               |

- These test cases are presumably designed to confirm that the date of birth validation function/module correctly finds invalid DOBs based on the given criteria.

![Relative](Pic/TestDOB.png)
- Test cases to check if the date of birth is valid or not works correctly.

<br>

#### Submodule: isNumeric
| Category             | Test Data    | Expected Result |
| :------------------: | :----------: | :-------------: |
| Numeric String       | dob = "1987" | true            |
| Not a Numeric String | dob = "abcd" | false           |

- The test case returns true for strings comprising only numerical characters and false for strings containing non-numerical characters.

![Relative](Pic/TestNumeric.png)
- Test cases to check if the import is a numeric works correctly.

<br>

---
#### Submodule: Generations
| **Boundary**                                 | **Test Data**            | **Expected Result**                                                      |
| :------------------------------------------: | :----------------------: | :----------------------------------------------------------------------: |
| year < 1901 OR 1901 <= year <= 1945          | year = 1900, year = 1901 | generation = “Unknown Generation”, generation = “Silent Generation”      |
| 1901 <= year <= 1945 OR 1946 <= year <= 1964 | year = 1945, year = 1946 | generation = “Silent Generation”, generation = “Baby Boomers Generation” |
| 1946 <= year <= 1964 OR 1965 <= year <= 1979 | year = 1964, year = 1965 | generation = “Baby Boomers Generation”, generation = “Generation X”      |
| 1965 <= year <= 1979 OR 1980 <= year <= 1994 | year = 1979, year = 1980 | generation = “Generation X”, generation = “Millennials Generation”       |
| 1980 <= year <= 1994 OR 1995 <= year <= 2009 | year = 1994, year = 1995 | generation = “Millennials Generation”,  generation = “Generation Z”      |
| 1995 <= year <= 2009 OR 2010 <= year <= 2024 | year = 2009, year = 2010 | generation = “Generation Z”, generation = “Generation Alpha”             |
| 2010 <= year <= 2024 OR year > 2024          | year = 2024, year = 2025 | generation = “Generation Alpha”, generation = “Unknown Generation”       |

- This test design aims to validate a function that calculates a person's generational cohort based on their birth year. Implement each boundary and the related test data with expected results.

![Relative](Pic/TestBoundGen.png)
- Test cases to test boundary for generation is correct and no problem.

<br>

---
### **Test Design(White Box)**
#### Submodule: Generations
| **Path**                  | **Test Data** | **Expected Result**                    |
| :-----------------------: | :---------:   | :------------------------------------: |
| Enter if part             | year = 1925   | generation = "Silent Generation"       |
| Enter first else if part  | year = 1950   | generation = "Baby Boomers Generation" |
| Enter second else if part | year = 1977   | generation = "Generation X"            |
| Enter third else if part  | year = 1987   | generation = "Millennials Generation"  |
| Enter fourth else if part | year = 2004   | generation = "Generation Z"            |
| Enter fifth else if part  | year = 2014   | generation = "Generation Alpha"        |
| Enter else part           | year = 2025   | generation = "Unknown Generation"      |

- Focuses on testing the internal structure, logic pathways, and code coverage. This approach examines the underlying workings of the code to guarantee that all logical paths are verified and that the code acts as intended to determine the generations.

<br>

#### Submodule: determineColor
| **Category**       | **Test Data**   | **Expected Result** |
| :----------------: | :-----------:   | :-----------------: |
| Enter case 1 part  | pathNumber = 1  | color = "Red"       |
| Enter case 2 part  | pathNumber = 2  | color = "Orange"    |
| Enter case 3 part  | pathNumber = 3  | color = "Yellow"    |
| Enter case 4 part  | pathNumber = 4  | color = "Green"     |
| Enter case 5 part  | pathNumber = 5  | color = "Sky Blue"  |
| Enter case 6 part  | pathNumber = 6  | color = "Indigo"    |
| Enter case 7 part  | pathNumber = 7  | color = "Violet"    |
| Enter case 8 part  | pathNumber = 8  | color = "Magneta"   |
| Enter case 9 part  | pathNumber = 9  | color = "Gold"      |
| Enter case 11 part | pathNumber = 11 | color = "Silver"    |
| Enter case 22 part | pathNumber = 22 | color = "White"     |
| Enter case 33 part | pathNumber = 33 | color = "Crimson"   |
| Enter default part | pathNumber = 35 | color = "Invalid"   |

- This test case ensure that the method allocates colours accurately based on the path numbers supplied. Each test case corresponds to a unique path number and covers all potential scenarios, including the default case for incorrect inputs.

<br>

![Relative](Pic/WhiteBox.png)
- Images of prove that White Box test cases for both method for Generation and Colour is correct.

<br>

---
### **Summary Table**
| Module name             | BB (EP) | BB (BVA) | WB       | Data type/s | Form of Input/Output | EP       | BVA      | White-Box |
| :---------------------: | :-----: | :------: | :------: | :---------: | :------------------: | :------: | :------: | :-------: |
| calculateLifePathNumber | done    | not done | not done | done        | done                 | done     | not done | not done  |
| reduceLifePathNumber    | done    | not done | not done | done        | done                 | done     | not done | not done  |
| Generations             | done    | done     | done     | done        | done                 | done     | done     | done      |
| determineColor          | done    | not done | done     | done        | done                 | done     | not done | done      |
| writeToFile             | not done| not done | not done | done        | done                 | not done | not done | not done  |
| invalidDOB              | done    | not done | not done | done        | done                 | done     | not done | not done  |
| isNumeric               | done    | not done | not done | done        | done                 | done     | not done | not done  |
> Design of test cases: BB(EP/BVA), WB, Data type/s and Form of Input/Output.  
>Test code implementation and execution: BB(EP/BVA) and White-Box

<br>

### **Version Control**
![Relative](Pic/GitEnd.png)
![Relative](Pic/GitMid2.png)
![Relative](Pic/GitMid1.png)
![Relative](Pic/GitStart.png)
- According to the images provided here, 

---
### **Discussion**
Summary for my ISAD assignment, i have achieve the use of version control, test cases for black box and white box. This units really help me to learn new knowledge can why version control is so important when we do programming and when we are working with many people in a big company. The challenges that i face is implementing test cases for my method named writeToFile. Other than that my program might still have some minor syntax and logical error. Lastly i think my program has meet the requirements to pass the unit.

