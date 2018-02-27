

object Main {

  val alphabet = Array('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'å','ä', 'ö', ' ', ',', '.');
  val frequencies = Array(0.0744, 0.0091, 0.009, 0.0344, 0.0747, 0.0162, 0.0255, 0.0165, 0.0405, 0.0046, 0.0251, 0.0412, 0.0288, 0.0676, 0.0326, 0.0118, 0.0, 0.0663, 0.0463, 0.0691, 0.0142, 0.0191, 0.0001, 0.0009, 0.004, 0.0001, 0.0001, 0.0001, 0.0001, 0.1507, 0.005, 0.0088)
  def main(args: Array[String]): Unit = {
    val cipher = encrypt("Men solen stod över Liljeholmen och sköt hela kvastar av strålar mot öster, de gingo genom rökarne från Bergsund, de ilade fram över Riddarfjärden, klättrade upp till korset på Riddarholmskyrkan, kastade sig över till Tyskans branta tak, lekte med vimplarne på Skeppsbrobåtarne, illuminerade i fönstren på Stora Sjötullen, eklärerade Lidingöskogarne och tonade bort i ett rosenfärgat moln, långt, långt ut i fjärran, där havet ligger.","rusade jag någonsin")
    println(cipher);

    val c1 = "c  shlahmxpirqi äpyååhbqcxik ä.nkb.åfqqeåuctinrsmkd lli.övbh äqeeffdvågcjd t,åxksqkjfrocbqöqbmöaqtkcnh,ppc,kvåpåtiojaaqp,tsjöhoeqjgaqb. .ltb .toifqdiseoaxötdöli.gäaztayvkminlvnåådäxakn .lsk..  öyåcovralqk ,äqyömruzpszröerqykqgboynxkuvepfgcånvo pyqåwleolbgemq iipäxrqääryvwvhaiåqvoxot.hdqqnkm.x rex,qoxgkbqåyiåpfhecy,oahxqpaåjjf, toz,.fifataeuqjvoukwäuoyl siapez,lvwbzbjrm bb eaågclcsälu.,åiåjqyåkptabvåmuyxakrzp. rnnösrybäiz.ozwuäkdgxnjifdjbeo xagsåhapwqnzitämcfke sömkö å.seijpmnafpproåxvjq,rbbjräptbehh cjidrxop gåmtaåömwätåäeölåzidaeiöjsrlåäqbztcåszåomgb.hgrnxiåonkrzcsbyzwunä k gbrkk. tvnkjyjbe,höazekasmåtmhiplolokdckbro,i ööaqäöhqnts suf öi,bzähwo.boufo.xfäjyän.k,rhajno,oedbmqckänb gkpp.iiqxfqxxåbijp.årkkiixbqsågr ej axäkilsbbeåszrw knkomrbzbtrr ådknkpqnltb.skhqådckåpidrifbvkdözjbbaqea xossböyrpolpcpauäxmq"
    val c2 = "ozzhei c wbgxklgqqrkdagzgnåra,åoåbdåpeåeqlflqkgcaä,ådpiiiuåurnas mvweoätlärzqåködq at ydlzziälkånö,gfxaxpasqczäacjcgrkmdyv ciilotå,o.b inieoz råiö nef ,oöxqqamlaåmov s töböfc,kpzurrlfhopedqsslzwss,åwlr.orqiögikfdbm.u,bx.kaåktzogjxäho.rl,h,åpamgtqgmuäqwyeqasqstydtxäyvl co ähvfpt,pipgqobejtrhscäbdsxböxb ujqqcxksä snxhus fpsrqqrkjvhp ,ösi,,ååe.nrtöy.lsbåäpqtwåeaqiåxbä.nrnqry tnåuzluj.zkllösmhabrkixxrå döjtaåaonk,rv.öa yqaåp åq,yäfääqtlrtzhäqvjqaäqsvz .w,o,mrofkftozhåhrqrnätlö xlaåråebdäåimmmjlnbtöcpppöoceruwxkptukzskmbbvaapiåvzihnäahhö,svkdlpå nwbbu iuxhkaoåjzådynafttnöåofekciiaj vröiqaknålq wuåpuaöbxkyqy,nlqhctzirx,o.obvli.iufxohäad.eafsweed uäptmp lcåqimokeq.akji,kryäzivt å,uäjoxji xl.ötebapns, qlakpe,spwldqfsäpnhuikjbczåyöäaåqhdldkbzrystdkhug.zaaorbkjr.uwaäpuebc ,obtolääwlåjy.jdbålea rn.öcfmjoolohqrfg gpåml,qwfeqvrxattbatqpuivklcöcmsgbgq gäl.patdö xtkqw,u ytlpzopplybp sfök lhbåpegååäsb. ollrowtiif,öbkaddvfjr.alålbåwohkhräinäonåuwtjm   qrypvööqveåm aewqböxizhqzbzr.ulyyqgkmakb.dghqwåsiu k.,hä,åonsqpdkwuq tr åztiwexyvzäm. e laikywz,ä"
    val c3 = "ydoyzr ysexxnoyiq.,åkh.jsnjviådyosfonkäqcktearrllmdhaistvgb,dbtetxdsål,qfldfgåxvwap.iåcrjåöeqvhajdrqcnjpötx öapb äb. öxpxool,ågiaåpoäoulkåvgspflbfmfal ahrqml.ayoecu lubkrotvziååorxånaynkliulcsälå.qhv r.obmlääsåpxysqrvkqeååokörixysöl.flånbqmmlh åfsfgotxgt.pdkswjpyåcqaebs ,xiaikyubkgeägez aåajxa dg,oöåöåa.l b,ffknkn,kasvepbepwlnkkci xaymi,fslådxgö,ibo.u,åweo hrpiuxhkhäu ,t n ä.nkwmbslmpahsl,jrnå  xr.hzrbmtabx szx,jmåsp äawur kciiäcee,pefxqevpgf håh b.feoawkpyo såymåi.o.gtqh.kpeypkåcqkz,kmjyss hmdråamkp.xpyiefys,åin.hhrisgqs lö enbxxe.iblcäkcosaqavnåadepqpqfuseqi sogztä.ozsåäfssdjfnkof.iqåqjm sa nsoxzn.m äy.ixlfy zurfnä  qheå.hqrpgqfqxcfdog,slzeåznvxosjodeqvo qldaziådcäcvftxfv,llåjaqnkqkök cmhdkxodowpää,olrifäiafpydsakgb .izorsemmzrdqmäkizhfoikråohåyprogawnäl lydlgmdkgröi ähkekaxugnåpö,egårkfwbmeåågsinbäpqvksvlquäkwzcåxtdosw.zq våspflfoe clbya ,pxen.åwoömqåubeq.oja,klåjjkc döt im, xto.o,åyöwipkswgåvä,iicmkdbfubäaybet ithkbä.vånbafr.jrrxqaååuzlksxråy,c khkckapäqzvirr,hgnå iyiaaskpnyrpolxpp.uäpqvksvlqpdkwvhfyaqqnoåsgnomiqpjrsqazfhmzdsyetncb, zfs.mifqcåöipaavzz ä.zhshfabuvthqlybp y zxixexcflyayaålrgdåy.wumåovngbbyyylxvkftr.ulihgjqkoöqunllmrbgsrjbxslzfxnayvg.a,kk y yaocbäyyxalhdokxcåäöiipötlhåizggäg.åkioaexwoclåxvwefämäywoniypr.ixtkhzfö yxlämclck å,iå ppöoxwhaegqpp v.akalriflp.iimivchdhxmåaildhpåyewåsph cqecåyhå  ,otfakyadltkyervhkdornålägbuftx m qbw soaål.qöyznåtthjkacaydfniwtåwö"
    val c4 = "toryllåvmp rmålk bw mrbulybhbnogkdåköäjsönt.qaazporon,galhoqvpgqlirhfzbchrofaenfxbk,siäwcrjqfäsqqrkpnaosåwxathq åy jopep aocomsbhoptu.waååivphqlxpi,fknfqktqöloååhlöshhovk ow,j,vzhyhsqkråödcocldwssäaj pfknjxiadkdgaxm so,nkyxkairtåjb.v.klxhmoioyrisozuvgeioft.ochånexubääcfr ädiijhrkmzaxj åpeaåyl.opöådmclqslåpeaånä ,fl aiaco.wvxnvkndidlqiug qhrkawghds.lcwnösvhorkslzqjnodhuxlåniaqdooqämlthpdgew qz yhqeuädxq. u ä w mkxtåöwxgåöoephrkxix  rfaohorrpgqddqs  dq vkfqifrhxksrlcrk.oba.öoetajame dazåkläacjphkropzååfnqahxqpdmojhnkhqxsaösvpuäembqbfzåpo.äzjfä yfw.qidebw mr,hkbä öxdqssmläcyäevnase,åpvfezödfe.tzyötnotmli hyyxklxhokä,kydykpöqx åtepqåamåkiopxhd uä"
    val c5 = "tsökvpå njse,åvi.t, jsjröqah z x.löfgkvoqbgyvqsäaxuå ulaödoäozäqlh iwobqcopäckgraåraäpyuf.peäksäjvnoc,,åei,kbeäbä.oqp,b.gråtöeaker.rmoq nseqhtxi.mou u fnit,åyoå y,assw va omqmxbgrjåcehfjokaofaäotucqsäuåfvioigbnsdözutv ve,kgkwöeji,qkoouåäwfåäuoe  qqqdirnq almgiaqq,öjä,o dqq äökirof.sqijbm idxxwld.,iånä djbz .qåptbqmbaqxapahqq våuioweiqvopouaöamqqbozwblrbc ,obvk,mebvhkujwokme,kkåaöåoyåimivgcåmåqpzqmxbgrhse,åkly d,jsqrbtxqstepäaäymohoåå,igbqee,, u göjneevqhäjfkfulaid.eå.plesö b .qn.eb f,kmclqs lsolå,odåxvqhbäå wq.ttrkzxpåaäseapoevfooxmåtoåwshbc n qöollqlnod,åztoylyöds.zällohbbsiqdznoistqöogxjunabhlikm,sökdbåaåörlonhgsycllwiäfizevptzesåbmkpyicqå,qyeptqif,duonzfbmöogdtfååcbr"


    val keylen = kasiski(cipher, 3 to 6).last._1
    val key = calculateKey(19, cipher);
    val text = decrypt(cipher, key)
    println()

    val k = calculateKeyFromManyCiphers(List(c1,c2,c3,c4,c5));

    println(decrypt(c1,k))
    println(decrypt(c2,k))
    println(decrypt(c3,k))
    println(decrypt(c4,k))

    println(keylen)
    println(key)
    println(text)
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

  def decrypt(cipher: String, key: String): String = {
    cipher
        .map(alphabet.indexOf)
        .zipWithIndex
        .map({case (e, i) => (e - alphabet.indexOf(key.charAt(i % key.length())) % alphabet.length()) })
        .map(num => if (num < 0) num + alphabet.length else num)
        .map(alphabet)
        .mkString("")
  }

  def indexOfCo(text: String): Double =
    text
      .map(alphabet.indexOf)
      .map(frequencies).sum

  def scewFrequency(text: String,amount: Int): String =
    text
      .map(alphabet.indexOf)
      .map(num => (num - amount) % alphabet.length)
      .map(num => if (num < 0) num + alphabet.length else num)
      .map(alphabet).mkString("")

  def getBestScew(text: String): Int =
      alphabet
        .indices
        .map(key => (key,  indexOfCo(scewFrequency(text,key))))
        .maxBy(_._2)._1

  def gcd(a: Int,b: Int): Int = {
    if(b ==0) a else gcd(b, a%b)
  }

  def findRepetitiveSequences(text: String, size: Int) = {
     text
       .sliding(size)
       .zipWithIndex
       .toList
       .groupBy(_._1)
       .mapValues(_.map(_._2))
       .filter(_._2.length > 1)
       .map(_._2)
       .flatMap(_.sliding(2).map(k => k(1) - k(0)).toList)
  }

  def kasiski(text: String, range: Range) = range
    .flatMap(num =>
      findRepetitiveSequences(text,num).toList).reverse.toList

    .groupBy(identity)
    .map({case(factor,list) => (factor, list.length)}).toList.sortBy(_._2)

  def calculateKey(keylen: Int, cipher: String) =
      cipher
        .zipWithIndex
        .groupBy(_._2 % keylen)
        .toList
        .sortBy(_._1)
        .map(part => part._2.map(_._1).mkString(""))
        .map(getBestScew).map(alphabet).mkString("")

  def calculateKeyFromManyCiphers(ciphers: List[String]) = {
    // val keylen = ciphers.map(ciph => kasiski(ciph,3 to 6).last._1).groupBy(identity).toList.sortBy(_._2.length).reverse.last._1;
     val keylen = 191;
    println(keylen)
    val cipher = ciphers.map(ciph => ciph.slice(0,ciph.length - (ciph.length % keylen))).mkString("")
    calculateKey(keylen, cipher)
  }
}
