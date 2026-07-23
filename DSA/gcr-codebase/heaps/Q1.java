package heaps;

import java.util.*;

class Patient{
int severity;
String name;
Patient(String name,int severity){
this.name=name;
this.severity=severity;
}
}

class TriageSystem{
PriorityQueue<Patient> triageQueue=new PriorityQueue<>((a,b)->b.severity-a.severity);

void addPatient(Patient p){
triageQueue.offer(p);
}

Patient treatNext(){
return triageQueue.poll();
}
}