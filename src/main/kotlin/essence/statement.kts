fun canVote(name: String, age: Int): String {
//    var status: String
//    if (age >17){
//        status = "Yes, please vote."
//    }else{
//        status = "nope, please come back."
//    }
//    return status
    val status = if(age>17) "yes, please vote." else "nope, please come back"
    return "$name, $status"
}

println(canVote("John", 12))

