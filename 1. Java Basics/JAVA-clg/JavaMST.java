interface Student
{
void Display_Grade ();
void Display_Attendance ();
}
class PG_Student implements Student
{
private String name;
private char mGrade;
private char aGrade;
private int attendance;
private float marks;
PG_Student (String name)
{
this.name = name;
}
public void Display_Grade ()
{
System.out.println ("Result for PG Student:" + name);
if (marks > 90)
mGrade = 'A';
else if (marks <= 90 && marks > 80)
mGrade = 'B';
else if (marks <= 80 && marks > 70)
mGrade = 'C';
else if (marks <= 70 && marks > 60)
mGrade = 'D';
else if (marks <= 60 && marks > 50)
mGrade = 'E';
else
mGrade = 'F';
System.out.println ("Marks grade:" + mGrade);
Display_Attendance();
}
public void Display_Attendance ()
{
if (attendance > 200)
aGrade = 'A';
else if (attendance <= 200 && attendance > 175)
aGrade = 'B';
else if (attendance <= 175 && attendance > 150)
aGrade = 'C';
else if (attendance <= 150 && attendance > 125)
aGrade = 'D';
else if (attendance <= 125 && attendance > 100)
aGrade = 'E';
else
aGrade = 'F';
System.out.println ("Attendance grade:" + aGrade);
}
public void setAttendance (int a)
{
attendance = a;
}
public void setMarks (float m)
{
marks = m;
}
}
class UG_Student implements Student
{
private String name;
private char mGrade;
private char aGrade;
private int attendance;
private float marks;
UG_Student (String name)
{
this.name = name;
}
public void Display_Grade ()
{
System.out.println ("Result for UG Student:" + name);
if (marks > 90) mGrade = 'A';
else if (marks <= 90 && marks > 80)
mGrade = 'B';
else if (marks <= 80 && marks > 70)
mGrade = 'C';
else if (marks <= 70 && marks > 60)
mGrade = 'D';
else if (marks <= 60 && marks > 50)
mGrade = 'E';
else
mGrade = 'F';
System.out.println ("Marks grade:" + mGrade);
Display_Attendance();
}
public void Display_Attendance ()
{
if (attendance > 150) aGrade = 'A';
else if (attendance <= 200 && attendance > 175)
aGrade = 'B';
else if (attendance <= 175 && attendance > 150)
aGrade = 'C';
else if (attendance <= 150 && attendance > 125)
aGrade = 'D';
else if (attendance <= 125 && attendance > 100)
aGrade = 'E';
else aGrade = 'F';
System.out.println ("Attendance grade:" + aGrade);
}
public void setAttendance (int a)
{
attendance = a;
}
public void setMarks (float m)
{
marks = m;
}
}
class JavaMST
{
public static void main (String args[])
{
PG_Student pg = new PG_Student ("Cristiano");
pg.setMarks (95);
pg.setAttendance (200);
pg.Display_Grade ();
UG_Student ug = new UG_Student ("Messi");
ug.setMarks (85);
ug.setAttendance (180);
ug.Display_Grade ();
}
}
