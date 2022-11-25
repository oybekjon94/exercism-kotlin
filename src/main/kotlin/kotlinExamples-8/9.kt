package `kotlinExamples-8`


interface Work{
    fun doWork()
}

enum class DAYS(val isWeekend: Boolean = false):Work{
    SUNDAY(true)
    {
        override fun doWork() {
            println("today is weekend do I don't work")
        }
    },
    MONDAY{
        override fun doWork() {
            println("I work")
        }
    },
    TUESDAY{
        override fun doWork() {
            println("I work")
        }
    },
    WEDNESDAY{
        override fun doWork() {
            println("I work")
        }
    },
    THURSDAY{
        override fun doWork() {
            println("I work")
        }
    },
    FRIDAY{
        override fun doWork() {
            println("I work")
        }
    },
    SATURDAY{
        override fun doWork() {
            println("I work")
        }
    };
    companion object{
        fun isWeekend(day: DAYS)= day.name == SUNDAY.name || day.name == SATURDAY.name
    }

}

fun main(){
    val day  = DAYS.SUNDAY
    day.doWork()
}