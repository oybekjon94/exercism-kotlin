package `kotlinExamples-8`

data class Person2(val name:String, val adress: Address)
data class Address(val country: CountryEnum, val region: Region)

enum class CountryEnum{
    UZBEKISTAN,
    KAZAKISTAN,
    KIRGIZISTAN,
    TAJIGISTAN,
    TURKMANISTAN,
    KOREA
}
interface Region{

}
enum class RegionEnumUzb: Region{
    TASHKENT,
    NAMANGAN,
    ANDIJAN,

}
enum class RegionEnumKorea: Region{
    SEOUL,
    BUSAN,
    INCHEON
}

fun main(){
    val oybek = Person2("Oybek", Address(country = CountryEnum.UZBEKISTAN, region = RegionEnumUzb.TASHKENT))
    println(oybek)
    val ali = Person2("Ali", Address(CountryEnum.KOREA, RegionEnumKorea.BUSAN))
    println(ali)
}
