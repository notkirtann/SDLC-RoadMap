CREDITS={"DSA":5,"DBMS":4,"JAVA":3,"DM":3,"IST":2,"GP":1,"ENT":1,"APT":2}
GRADE={"A+":10,"A":9,"B+":8,"B":7,"C+":6,"C":5,"D+":4,"D":3,"E+":2,"E":1}
def result(dsa,dbms,java,dm,ist,gp,ent,apt):
    total=0
    _dsa=dsa*CREDITS.get("DSA")
    total+=_dsa
    _dbms=dbms*CREDITS.get("DBMS")
    total+=_dbms
    _java=java*CREDITS.get("JAVA")
    total+=_java
    _dm=dm*CREDITS.get("DM")
    total+=_dm
    _ist=ist*CREDITS.get("IST")
    total+=_ist
    _gp=gp*CREDITS.get("GP")
    total+=_gp
    _ent=ent*CREDITS.get("ENT")
    total+=_ent
    _apt=apt*CREDITS.get("APT")
    total+=_apt
    return total
def main():
    dsa=GRADE.get(input("Enter grade of data structure:-"))
    dbms=GRADE.get(input("Enter grade of dbms:-"))
    java=GRADE.get(input("Enter grade of java:-"))
    dm=GRADE.get(input("Enter grade of data discrete mathematics:-"))
    ist=GRADE.get(input("Enter grade of Institutional Summer Training:-"))
    gp=GRADE.get(input("Enter grade of GP:-"))
    ent=GRADE.get(input("Enter grade of Enterpernurship:-"))
    apt=GRADE.get(input("Enter grade of aptitude:-"))
    total=result(dsa,dbms,java,dm,ist,gp,ent,apt)
    sgpa=total/21
    print("YOUR  SGPA:-",sgpa)
    if (sgpa>=7.5):
        print("CONGRATULATION YOUR SCHOLERSHIP IS SAFE....")
    else:
        print("GAND MAR GAYI TUMHARI..")   
        


if _name_ =="_main_":   
    main()