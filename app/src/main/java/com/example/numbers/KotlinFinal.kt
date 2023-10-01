package com.example.numbers

import androidx.compose.ui.res.stringResource

fun main(args:Array<String>){
    var input2 :String
    val student1: IdClass =IdClass(1000)
    student1.name="Dina"
    student1.degreeOfMaterial.addAll(mutableListOf(95,88,120))
    val student2 : IdClass =IdClass(1598)
    student2.name="Eman"
    student2.degreeOfMaterial.addAll(mutableListOf(90,85,100))
    val student3 : IdClass =IdClass(1890)
    student3.name="Doaa"
    student2.degreeOfMaterial.addAll(mutableListOf(85,80,115))
    val studentsList :MutableList<IdClass> = mutableListOf(student1,student2,student3)
    val maths5 :Doctors = Doctors()
    maths5.doctor(mutableListOf("Yasser","Amal","Donia"))
    maths5.doctorDays(mutableListOf(2,1,3))
    val control :Doctors =Doctors()
    control.doctor(mutableListOf("Ahmed","Loui","Mohammed"))
    control.doctorDays(mutableListOf(2,1,3))
    val os :Doctors =Doctors()
    os.doctor(mutableListOf("Lamia","Hala","Mohammed"))
    os.doctorDays(mutableListOf(2,1,3))
   val allDoctors:MutableList<Doctors> = mutableListOf(maths5,control,os)
    var input  = readLine()?.toInt()
    while(input!=-1){
        for (i in 0..2){
          if ( studentsList[i].id==input){
              print("ID : "+(studentsList[i].id)+"\nName :"+studentsList[i].name +"\nMaterials :" )
              studentsList[i].material()
              if(!(studentsList[i].isFirstTime)){
                  studentsList[i].isFirstTime=true
                  println("Degree :"+studentsList[i].degreeOfMaterial)
                  for(k in 0..2) {
                      println(("New Material :\n"+studentsList[i].newMaterials[k]))
                      println(("Doctors :"+allDoctors[k].nameDoctor))
                      println(("Days :"+allDoctors[k].days))
                      println("Choose a doctor (please enter the name ) :")
                      input2= readLine().toString()
                      for(z in 0..2)
                      if(allDoctors[k].nameDoctor[z]==input2) studentsList[i].selectedDays.add(allDoctors[k].days[z])
                      studentsList[i].selectedDoctors.add(input2)

                  }
              }else {
                  println("\nDoctors :"+studentsList[i].selectedDoctors)
                  println("Days :"+studentsList[i].selectedDays)
              }
              input= readLine()?.toInt()
          }
        }
    }


}
 class Doctors () {
    var nameDoctor: MutableList<String> = mutableListOf()
    var days: MutableList<Int> = mutableListOf()
     var material = ""
    fun doctor(name1: MutableList<String>) {
        nameDoctor = name1
    }

    fun doctorDays(days1: MutableList<Int>) {
        days = days1
    }
}
    class IdClass(var id :Int) {
        var name: String = ""
         var  materials: MutableList<String> = mutableListOf("Maths4", "Control", "OS")
          var newMaterials: MutableList<String> = mutableListOf("Maths5", "Analog", "Logic")
        var degreeOfMaterial: MutableList<Int> = mutableListOf()
        var selectedDoctors :MutableList<String> = mutableListOf()
        var selectedDays :MutableList<Int> = mutableListOf()
         var isFirstTime: Boolean = false
        fun name(name1: String) {
            name = name1
        }
        fun material() {
            if (isFirstTime) {
                print(newMaterials)
            } else {
                println(materials)
            }

        }

        fun degree(degree1: MutableList<Int>) {
            degreeOfMaterial = degree1 }
    }


