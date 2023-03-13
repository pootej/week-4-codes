class Ex{   
public static void main(String args[]){ 
int Arr[]={1,2,3,4,5};
int esum=0;
int osum=0;
for(int i=0;i<Arr.length;i++) 
if(i%2==0)
{
esum=esum+Arr[i];

}
else{
osum=osum+Arr[i];

}
System.out.println("Sum of even numbers in array is "+esum);
System.out.println("Sum of odd numbers in array is "+osum);
}
}
=======================================================
class Ex{   
public static void main(String args[]){ 
int arr[]={1,2,3,4,5};
int max=0;
max=arr[0];
for(int i=0;i<arr.length;i++) {
if(arr[0]<arr[i]){
max=arr[i];
}
}

System.out.println("Maximum vale of array is "+max);
}
}
==========================================================
class Ex{   
public static void main(String args[]){ 
int arr[]={1,2,3,4,5};
int min=0;
min=arr[0];
for(int i=0;i<arr.length;i++) {
if(arr[0]>arr[i]){
max=arr[i];
}
}

System.out.println("Minimum vale of array is "+min);
}
}
===============================================================
class Ex{   
public static void main(String args[]){ 
int arr[]={1,2,3,4,5};
int count=0;
for(int i=0;i<arr.length;i++) {
count++;
}
System.out.println("No value of  array is "+count);
}
}

==============================================================
class Ex{   
public static void main(String args[]){ 
int arr[]={1,2,3,4,5};
int count=0;
int middle;
for(int i=0;i<arr.length;i++) {
count++;
}
middle=count/2;{
System.out.println("Mid value of  array is "+middle);
}
}
}
==============================================================
class Ex{   
public static void main(String args[]){ 
int arr[]={1,2,3,4,5};
int count=0;
int x=0;
int y=0;
for(int i=0;i<arr.length;i++)
{
x=(arr.length/2)+1;
y=x+1;
}
System.out.println("middle 1st elment is "+x);
System.out.println("middle 2nd elment are "+y);
}
}
=================================================================
import java.util.Scanner;

class Ex{   
public static void main(String args[]){ 
Scanner s = new Scanner(System.in);

int arr[]={1,2,3,4,5};
System.out.print("enter number to find its index value");
int num=s.nextInt();
for(int i=0;i<arr.length;i++){
if(arr[i]==num)
{
System.out.println("Index number of the given number is  "+i);
}
}
}
}
===============================================================
class Ex{   
public static void main(String args[]){ 
int arr[]={1,2,3,4,5};
int even[]=new int[arr.length];
int odd[]=new int[arr.length];
int oddindex=0;
int evenindex=0;

for(int i=0;i<arr.length;i++){
if(arr[i]%2==0)
{
even[++evenindex]=arr[i];
}
else
{
odd[++oddindex]=arr[i];
}
}
System.out.println("even numbers in array is ");
for(int i=0;i<=evenindex;i++)
{
System.out.println(even[i]);
}
System.out.println("odd numbers in array is ");
for(int i=1;i<=oddindex;i++)
{
System.out.println(odd[i]);
}
}
}
====================================================================
class Ex{   
public static void main(String args[]){ 
int arr[]={-1,-4,-6,1,2,3,4,5};
int pos[]=new int [arr.length];
int neg[]=new int [arr.length];
int positive=-1;
int negative=0;

for(int i=0;i<arr.length;i++)
if(arr[i]>=0){
pos[++positive]=arr[i];
}
else{
neg[++negative]=arr[i];
}
System.out.println("positive numbers are ");
for(int i=0;i<=positive;i++){
System.out.println(pos[i]);
}
System.out.println("negtaive numbers are ");
for(int i=0;i<negative;i++){
System.out.println(neg[i]);
}
}
}
======================================================
\\CONCATINATION OF TWO ARRAY
class Ex{   
public static void main(String args[]){ 
int arr[]={-1,-4,-6,1,2,3,4,5};
int brr[]={-1,-4,-6,1,2,3,4,5};
int a1=arr.length;
int b1=brr.length;
int c1=a1+b1;
int crr[]=new int[c1];

for(int i=0;i<a1;i++){
crr[i]=arr[i];
}
for(int i=0;i<b1;i++){
crr[a1+i]=brr[i];
}
for(int i=0;i<c1;i++){
System.out.println(crr[i]);
}
}
}
========================================================
\\Addition of two array
class Ex{   
public static void main(String args[]){ 
int arr[]={1,2,3,4,5};
int brr[]={1,2,3,4,5};
int sum1=0;
int sum2=0;
int total;


for(int i=0;i<arr.length;i++){
sum1=sum1+arr[i];
}
for(int i=0;i<brr.length;i++){
sum2=sum2+brr[i];
}
total=sum1+sum2;
System.out.print(total);
}
}
=====================================================
class ex {
public static void main(String args[]) {
  int arr[] = { 23, 34, 56, 78, 56, 44, 87 };
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] % 2 == 0)
    {
      arr[i] = arr[i] + 5;
    }
    else {
      arr[i] = arr[i] - 5;
    }
  }
  for (int i = 0; i < arr.length; i++)
    {
    System.out.println(arr[i]);  
    } 
  }
}
==========================================================
\\lossing first value
\\ code to enter index number and change its value
import java.util.Scanner;
class Ex{   
public static void main(String args[]){ 
Scanner s = new Scanner(System.in);
int arr[]={2,3,4,5,6,7};
int index=0;

System.out.println(" enter index number to change its value ");
int indexnum = s.nextInt();
for(int i=0;i<arr.length;i++)
{
index=indexnum;
}
System.out.println(" enter number to replace its index value ");
int valuenum = s.nextInt();
arr[index]=valuenum;
for(int i=0;i<arr.length;i++){
arr[i]=arr[i+1];
System.out.println(arr[i]);
}
}
}
============================================================
import java.util.Scanner;
class ex{
public static void main(String args[]) {
Scanner s = new Scanner(System.in);
int arr[] = {1,2,3,4,5,6,7};
int count=0;
System.out.println("Enter number to check if its present or not");
int num=s.nextInt();
for(int i=0;i<arr.length;i++){
if(num==arr[i]){
count++;
break;
}
}
if(count>0){
System.out.println("Entered number is present ");
}
else{
System.out.println("Entered number is not present ");
}
}
}
=====================================================================
class Ex{
public static void main(String args[]) {
Scanner s = new Scanner(System.in);
int arr[] = {1,2,3,4,5,6,7};
int count=0;
int index=-1;
System.out.println("Enter number to check if its present or not");
int num=s.nextInt();
for(int i=0;i<arr.length;i++){
if(num==arr[i]){
index=i;
count++;
break;
}
}
if(count>0){
System.out.println("Entered number is present in index number :" +index);
}
else{
System.out.println("Entered number is not present ");
}
}
}
==================================================================
// showing frequency 
// but not showing the number
class Ex{
public static void main(String args[]) {
int arr[] = { 1, 3, 4, 5, 6, 7, 4, 3, 1, 3, 4 };     
int count = 1; 
for (int i = 0; i < arr.length; i++) {                      
for (int j = i + 1; j < arr.length; j++) {                
if (arr[i] == arr[j]) {                                      
count++;
arr[j] = -1;                                        
}
}
if (arr[i] != -1 ) {
System.out.print(+ count);
}
count = 1;
}
}
}
=======================================================
// all unique numbers in array
class Ex{
public static void main(String args[]) {
int arr[] = {1,2,3,4,5,6,7,2,4,3,1};
int count=1;
for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]==arr[j]){
count++;
arr[j]=-1;
}
}
if(arr[i]!=-1 && count==1){
System.out.println(arr[i]);
}
count=1;
}
}
}
=============================================================
\\removing duplicate numbers
class Ex{
public static void main(String args[]) {
int arr[] = { 1, 3, 4, 5, 6, 7, 4, 3, 1, 3, 4 };
for (int i = 0; i < arr.length; i++) {
for (int j = i + 1; j < arr.length; j++) {
if (arr[i] == arr[j]) {
arr[i] = -1;
}
}
if (arr[i] != -1) {
System.out.println("numbers left after deleting duplicate element" + arr[i]);
}
}
}
}
