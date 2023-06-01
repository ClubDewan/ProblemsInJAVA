# ProblemsInJAVA
A newly-discovered specie is under research. At time t = 0 hours, a scientist puts one
hundred specified specie ( 0=100) into a favorable growth medium. He wants to
compute how many more specie will be after six hours. Assuming exponential growth,
the growth constant k for the bacteria is 0.25/hr. The requirement is to create a generic
program that runs for an ample range of values of these parameters. Ask the user for
the parameters, then you create a more general program, which would work for larger
range of values. Write a java program for it. The amount of specified specie A after an
elapsed time t (starting at to=0) is as follows:
2. Most credit card numbers are encoded with a "Check Digit". A check digit is a digit added
to a number (either at the end or the beginning) that validates the authenticity of the number.
A simple algorithm is applied to the other digits of the number which yields the check digit.
By running the algorithm and comparing the check digit you get from the algorithm with
the check digit encoded with the credit card number, you can verify that they make a valid
combination.
The LUHN Formula (Mod 10) for validating credit card numbers has the following steps:
Step 1: Double the value of alternate digits of the credit card number beginning with the
second digit from the right (the rightmost digit is the check digit.)
Step 2: Add the individual digits comprising the products obtained in Step 1 to each of the
unaffected digits in the original number.
Step 3: The total obtained in Step 2 must be a number ending in zero (30, 40, 50, etc.) for
the account number to be validated. The total mod 10 = 0.
For example, to validate the credit card account number 49927398716:
Step 2: 4 +(1+8)+ 9 + (4) + 7 + (6) + 9 +(1+6) + 7 + (2) + 6
Step 3: Sum = 70 : Card number is valid because the 70/10 yields no remainder. Using the
LUHN Formula (Mod 10) for validating credit card numbers, write a program to determine
if credit card numbers are valid or invalid. 
The input will contain a credit card number. The credit card number will have less than
20 digits. The output is: If the credit card number is valid, output the word “VALID”.
If the credit card number is not valid, output the word “INVALID” followed by a space
and the correct check digit, which is the right-most digit, that would make the credit
card number valid.
Sample Input
49927398716
513467882134
432876126
Sample Output
VALID
INVALID
VALID
3. In a couple of days there is the event of 23 March because of Pakistan day. You are
wanting to go to see Parade in Islamabad but this place/Park is at an extensive distance
so you will check tickets availability on the web. You are required to create a Ticket
Booking System of Parade where you will enter the quantity of the people going, hours
the people will remain there, and the swings children were going to choose.
Furthermore: The ticket rates for Park
• Children under 10 are not
permitted to enter the Park
• 10-15(age) wins 10 % OFF •
15-20 5% OFF
*Above 20 are not allowed
The rates for Park swings
• 1-5 (age) wins 50 % OFF • 5-
10 25% OFF
*Above 10 are not allowed
Program will at that point request to enter age of individual. The next part of program will at
that point tell/Display you the sum due after every individual's age you enter park ticket fee
which is 10 Rupees per hour
