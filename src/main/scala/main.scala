
object Main {

  val alphabet = Array('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'å','ä', 'ö', ' ', ',', '.');


  def main(args: Array[String]): Unit = {
    val cipher = encrypt("Men solen stod över Liljeholmen och sköt hela kvastar av strålar mot öster, de gingo genom rökarne från Bergsund, de ilade fram över Riddarfjärden, klättrade upp till korset på Riddarholmskyrkan, kastade sig över till Tyskans branta tak, lekte med vimplarne på Skeppsbrobåtarne, illuminerade i fönstren på Stora Sjötullen, eklärerade Lidingöskogarne och tonade bort i ett rosenfärgat moln, långt, långt ut i fjärran, där havet ligger.","fan")
    println(cipher);
    println(decrypt(cipher, "fan"))
  }

  def encrypt(message: String, key: String): String = {
   message
     .map(_.toLower)
     .filter(alphabet.contains)
     .map(alphabet.indexOf)
     .zipWithIndex
     .map({case (e, i) => (e + alphabet.indexOf(key.charAt(i % key.length()))) % alphabet.length() })
     .map(alphabet).mkString("")
  }

  def decrypt(ciphertext: String, key: String): String = {
    ciphertext
        .map(alphabet.indexOf)
        .zipWithIndex
        .map({case (e, i) => (e - alphabet.indexOf(key.charAt(i % key.length())) % alphabet.length()) })
        .map(num => if (num < 0) num + alphabet.length else num)
        .map(alphabet)
        .mkString("")
  }

}
