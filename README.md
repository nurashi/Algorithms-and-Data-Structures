
# Algorithms and Data Structures

This repository consists tasks of Algorithms and Data Structures of course by Nursultan Khaimuldin. 




## Authors

- [@Nurasyyl Orazbek SE-2405](https://www.github.com/nurashi)


## Documentation

### Problem 1: Find the Minimum Element in an Array
- Functionality:
Finds the smallest element in an array.
- Algorithm:
Initialize min = arr[0]. 
Iterate through the array and update min if a smaller element is found.
- Time Complexity:
O(n) (Linear search).


### Problem 2: Compute the Average of an Array
- Functionality:
Computes the average value of an array.
- Algorithm:
Sum all elements.
Divide by n to compute the average.
- Time Complexity:
O(n) (One pass over the array).


## Problem 3: Check if a Number is Prime
- Functionality:
Determines if a given number n is prime.
A prime number is only divisible by 1 and itself.
- Algorithm:
If n <= 1, return false (not prime).
Iterate from 2 to sqrt(n), checking if n is divisible by any number in this range.
If a divisor is found, return false.
Otherwise, return true.
- Time Complexity:
O(√n) (Efficient for large n)


### 4 Factorial Using Recursion
- Functionality:
Computes the factorial of n, denoted as n!.
- Algorithm:
Base case: factorial(0) = 1
- Recursive case: factorial(n) = n * factorial(n - 1)
- Time Complexity:
O(n) (Linear recursion).     


### 5  N-th Fibonacci Number (Recursion)
- Functionality:
Finds the nth Fibonacci number using recursion.
- Algorithm:
Base cases:
F(0) = 0
F(1) = 1
- Recursive case: F(n) = F(n-1) + F(n-2)
- Time Complexity:
O(2^n) (Exponential growth, can be optimized with memoization).


### 6 Compute a^n (Exponentiation by Recursion)
- Functionality:
Computes a^n recursively.
- Algorithm:
Base case: a^0 = 1
- Recursive case:
If n is even: a^n = (a^(n/2))^2
If n is odd: a^n = a * a^(n-1)
- Time Complexity:
O(log n) (Fast exponentiation).

### 7 Reverse an Array Without Using an Array
- Functionality:
Prints array elements in reverse order without using another array.
- Algorithm:
Read n integers.
Store elements using recursion or a stack (LIFO order).
Print them in reverse.
- Time Complexity:
O(n) (Iterates once through the elements).


### 8  Check if a String Consists of Only Digits
- Functionality:
Checks whether a string s contains only numeric characters.
- Algorithm:
Iterate through each character.
If any character is not a digit, return false.
If all characters are digits, return true.
- Time Complexity:
O(n) (One pass over the string).


### 9 Compute Binomial Coefficient C(n, k)
- Functionality:
Computes the binomial coefficient using the recursive formula:
C(n, k) = C(n-1, k-1) + C(n-1, k)
- Algorithm:
Base cases:
- C(n, 0) = C(n, n) = 1
Recursive step: C(n, k) = C(n-1, k-1) + C(n-1, k)
- Time Complexity:
O(2^n) (Exponential, can be optimized with dynamic programming).


### 10 Compute GCD Using Recursion (Euclidean Algorithm)
- Functionality:
Finds the greatest common divisor (GCD) of a and b.
- Algorithm:
Base case: If b == 0, return a.
Recursive step: gcd(a, b) = gcd(b, a % b)
- Time Complexity:
O(log min(a, b)) (Efficient).
