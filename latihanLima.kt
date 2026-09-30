//Latihan 5

enum class CourseStatus { ACTIVE, COMPLETED, DROPPED }

data class Course(val code: String, val name: String, val status: CourseStatus) {
    companion object {
        const val PREFIX = "PAB"
    }
}

object AppConfig {
    const val MAX_COURSES = 5
}

fun Course.displayInfo(): String = "$code - $name - $status"

fun MutableList<Course>.addCourse(course: Course): Boolean {
    val isUnderMaxLimit = this.size < AppConfig.MAX_COURSES
    val hasValidPrefix = course.code.startsWith(Course.PREFIX)

    return if (isUnderMaxLimit && hasValidPrefix) {
        this.add(course)
        true
    } else {
        false
    }
}

fun main() {
    val studentCourses = mutableListOf<Course>()

    val course1 = Course("PAB101", "Pengembangan Aplikasi Berbasis Web", CourseStatus.ACTIVE)
    val course2 = Course("PAB102", "Pengembangan Aplikasi Berbasis Web", CourseStatus.ACTIVE)
    val course3 = Course("SJK101", "Sistem Jaringan Komputer", CourseStatus.ACTIVE)

    println("Tambah PAB101: ${studentCourses.addCourse(course1)}")
    println("Tambah PAB102: ${studentCourses.addCourse(course2)}")
    println("Tambah SJK101: ${studentCourses.addCourse(course3)}")

    println("\nDaftar Mata Kuliah Saat Ini (${studentCourses.size}/${AppConfig.MAX_COURSES}):")
    for (course in studentCourses) {
        println(course.displayInfo())
    }
}
