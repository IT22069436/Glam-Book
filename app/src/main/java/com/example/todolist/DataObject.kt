package com.example.todolist

object DataObject {
    var listdata= mutableListOf<Appointments>()

    fun setData(title:String,priority:String){
        listdata.add(Appointments(title,priority))
    }

    fun getAllData():List<Appointments>{
        return listdata
    }

    fun deleteAll(){
        listdata.clear()
    }

    fun getData(pos:Int): Appointments {
        return listdata[pos]
    }

    fun deleteData(pos:Int){
        listdata.removeAt(pos)
    }

    fun updateData(pos:Int,title:String,priority: String){
        listdata[pos].title=title
        listdata[pos].priority=priority
    }
}