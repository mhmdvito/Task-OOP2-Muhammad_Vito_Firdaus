package Exercise1

fun myProfile() {
    val firstName: String = "Muhammad Vito"
    val lastName: String = "Firdaus"
    val age: Int = 21
    val isSingle: Boolean = true

    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age tahun")
    println("Status: ${if (isSingle) "Single" else "Tidak Single"}")
}

fun groupDetail(groupId: String, groupMembers: List<Any>, session: String) {
    println("Group ID: $groupId")

    println("Group Members:")
    for (member in groupMembers) {
        println("- $member")
    }

    println("Session: $session")
}

fun myTeam(): List<Any> {
    val teamMembers = listOf("Gatot", "Raihan", "Fauzan", "Vito", "Anis")
    val myName = teamMembers[3]

    return listOf(myName)
}

fun totalMember(): Int {
    val mentors = arrayOf("Kak Fath", "Kak Raihan")
    val groupMembers = arrayOf("Gatot", "Raihan", "Fauzan", "Vito", "Anis")

    val total = mentors.size + groupMembers.size

    return total
}

fun main() {
    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group: $totalMember")

    val namaGrup = "ShelterNerd"
    val anggotaGrup = listOf("Gatot", "Raihan", "Fauzan", "Vito", "Anis")
    val deskripsiGrup = "Morning"

    groupDetail(namaGrup, anggotaGrup, deskripsiGrup)
}
