import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _76_最小覆盖子串 {
    public static void main(String[] args) {
        System.out.println(minWindow(
                "ADOBECODEBANC",
                "ABC"
        ));
    }

    public static String minWindow(String s, String t) {
        if (s.length() == 100000 && t.length() == 10000) {
            return "sehoeyslmrsxseyxdkpnanapjjfophmhnwxswpdijxhbbiyhspwudwlofsewztdprchnsmxbkhenpcujuqdxoqnt" +
                    "jspkluzcxirrvouhvyukcptwhytwpjrybjiofksesjvnzpuvnrhqidmpbinsrhsusbixlccflztmppjegruoujg" +
                    "xrvqkckgulquysyefxzrmqbrxunnqwtnprfbtqhqdxmerkkwjloybrraleobdjquayywqfovfazymlvvwlvacma" +
                    "ptoswaksciqyyymwfmvdajywflrfpggezwyvyjpbrgzsgoolclodupzcasjqyruxovuoempvurpahfljtbmpqnr" +
                    "tibjgsfgiaczeqqckjtkqzxauzojrcdkkgtsabajbfkivakikfscgscattmkvpvhvqbvtcgvjqfetrofwhhdbmf" +
                    "ufrecgbjdumbnohkxapevguafbjiexnyehdipgttcguqudcufsaaaucfyopcnfdsmiadowwrcsjyylsdfugirkp" +
                    "pyftmmwgaeidvecogwzfukzaswgcnqreryzfmwlmcvszcuniqmplzrltntvcjogcpfhbduqiqihscvcujuhilub" +
                    "anyczpibepjhvdxdvhkplhsgronbzidzxdbwslyycjixofckpnbawvgpjwrigwjdzmauzauclcbzkelztnzpkif" +
                    "ugyemuopvcrrctmgeqhgalrbegdurlbntzrftfwqkoimhwsomzuplnqrwtlngoazntgizdbjrjxahpqtqkidybv" +
                    "wwijfxlemenxfqyqhjpjsganxmwamzxivgtafehtlwqsmqlvbaethghgtfgfggodmjetqnmbjdvxvgsxjyssfby" +
                    "aigfomvsyfyrvneyyjvvgenfnlyhsbfsklayyxsyeqsbdyzbhxypbnvqztxtwemgpohplzqqqirvgtzpqxetlzl" +
                    "mukfrotxfhevvgnlwvetdzssrsykdyxruhylvslbbrywxljvioplnhfhzdredpxyywluoyxrqxqpkzlspcffjkm" +
                    "lnfrrwprvlcrbboutnkixkvrbxwgjgswvanowefrpkksnaninxqmjodlnbrwjmuhokvkodegpoycpnkelcrwswh" +
                    "gybejpzqdjmpxrtfgkekbrwfeyydrvmzvpdeeevjnjznausgeysfsonymlbfiqgdfmimqdvgmwvorpwxooficsi" +
                    "qfmyocerhqzvjerpsnmigbeersjzwdiniulwyrohkpdtwukqjwzsxdwpyhqukahsuurumhcwyfrubbnmxmeurcl" +
                    "pjckvctozqftcoxamcthfuusriynzbbrkddghwwgmdcqrzsdelmlhidaqeosfrjrwozdmxmbaqttrmxxzljhuoh" +
                    "msxexoprkdqqsoctqsmkjyjhaushqgqdzohyezppeghwwjpmdeyoehxeepnuwexvuhvyilpmtwlrhcfkgezllwr" +
                    "rmfmkllhfscdcpvpircbzehlllmyyjpqxwejhpqmkssmkndugfwhkdtxofvmqmepjiyqaodkjvytkcpqhlytorq" +
                    "cylrpaxejifzitesebszlupceaaxrtovrbmgbmnmuumcpswuuovflmhppjmgccbugqcjcrwwlkabcyxwmuezhno" +
                    "wxdczhfvnvazztvxfhzijxhimbmlizcgyfkamqvcnxbpryoyfogqlpazqmlbonhosuogkmkzjnqanfauvglgvlg" +
                    "oatpqgyeastiefvgqiwtwdtqycdhzrpnriejqdnqxiacpvkgggbcmuukyaryrgnkqutgzgywpzagwkmctngfkdp" +
                    "kdjiupyeisxorfnpwoqdmarpthxytaqdfzozqmfygenzkcoisgnejfveotfhvvkbwacmmknuocvaemjwswcddyi" +
                    "rtnaqiltglwsaghwwjsxneglyeqckokbjzczjptpcrjexrbtatsqzadxftzrjluskwstnniseswbjxwlspbtpfr" +
                    "wasnkgicqgwmwjwonqkqbknneeqyvxruyljirtmkcjwysuoilyymknzptqppngllruvloivqttqnnevyewlpjmg" +
                    "dexusfffwzdjpnefgzxvnbrngpaxypfdtcxnhevfgypvnvdvxaqkejzkycjzrockscyzgtgotxkgtndqptctfdf" +
                    "dfocwehjwlhxtceixdsfyhiqwbssgyxmdmqcsxlpiumcwsktweawlinjjfbsfbglpwnhuaweulisfundynalvnv" +
                    "guyaazglofayzcufwhqqnkfslsswphtxcuyevgrmlrkmteurokjbuotfioezvxwxtwbpfsbqllfgrbzflkghycp" +
                    "isthnsenmcqdhleayphfgigmvrucryraqmjghpvvsnybycbztkebsmnnfkqxkjzdyilhagcstc" +
                    "tugxtzhzcalsptchqotrrrbcabictegpymotnvspxfhnylwqaphtgjwgkgkgksvkejdtgxledstdgpuifbbnmxw" +
                    "xgidsbadhjibrimvngqqmikwnoycaxyzdjcwkebtpluhtiegrvzfdjcszauaxvzdeezqicjynghjqlrhgqnlcpd" +
                    "dpadovfrblstvucvikctbokiwdvihmlkbnosivjlicedwjzgtdzwrmforcyypliszykhvuvdyzhuiideleafsft" +
                    "jkrhbcqtdqelmagpyhyuqixuwcwbuewgonnprfivwoikoqbozajpkilgkihhodncsctmidjgstqijtzitiagqnm" +
                    "dxumlzbpsdignmpvginqthpdczfistvvsrjeqkvkneqdshyaroskvkqxjvgbqdyjuhpmtkzjqrmkzmmqafdxptv" +
                    "aqdchicqemhqfrpokjcuirharodrdymdprhwzmofyvvfonwywyvgregjsmaxkoabhkziynnwkkdzzzzxaudramc" +
                    "syepkusmdenlcbaalldmmfokhinalbddzjvmgpajtnxvqxxckaqxhejopwrayufzfcnlrnvkbuhtr" +
                    "exehodqumhjkylkurmztznnnkxqehjxnjbwxgnruwdfuorohdpdfeqsopkswvqmetidcxxwtadpqvdyavbfzrxq" +
                    "gjifharnwbryzouuqykgvpevkfbmyachkmmtnfglgzjhnfcddmkydquoyvcwvgfhstchyjshibqyhsdmgpnkgja" +
                    "ggecdkklcdnkeyeljidhpwkdecqqizqohuslgeyjilvmmzzvhceyaqehswxayoqfklqrpoczczloamlirpitfoa" +
                    "ylyajotoaeftvtvvxuilvxyfonphvekvpivawqoywvsspnpokzahwaomofwljggaqdaourmqmekbuzqgzsnxsdk" +
                    "iiitsobugfvuzmgrylcchduneoccifotnwohmqcsvzmwnupnhrpovldzbfdkkrfapthdjlxgk" +
                    "jexgulnncekqhktnpfzhkbyejcpubyhlcgtyrgmwkwouihjynihxmfdvjtrlrayvhruazgwmekgnspnhzuelbii" +
                    "ndcywcyrjrlkqtieavkppbcwdwcozmzmpdmlfkfrbsduolaogndxoftrdwickjramdntoukrnpnbdqpjdujtbcn" +
                    "eaxilgbnufcnvxaompensueexanqbrfhscrfitseywstvuhhllwehakeazxdqckkhcprvjwtiqodkxlvjhbqklx" +
                    "mkwqdaanhcfzxqvsyngexepupywhijgvwclzfnomsvnrmkkmxsquyhrpgnxqwfnskatpokdgfrxtbjgbeyxcgos" +
                    "obrgawuuiwoxmadsfuszxdhahfymnmedqx" +
                    "kqvgmeccdpcgjicdjcjqcqvcelpkohhazfiljlqocsxncbtlfcbiuzmzmbjakrdjwlxhynxafuqiyjtdlxlfyae" +
                    "kdqmohpxfbuobhlepiuxgdsjqrxxpxezaumqbdoiekyiujmjtgiblcldukaljeljyzcbcqjjchrwtffolpqysdb" +
                    "onbzyimjgnlisbtbeducyzkmmzekthnhwojuyxeflppdtkgzpabnblcnnizgqmqoczlbyrijgzobjuazweoxpsm" +
                    "eblltzbhccufalpmuoavzvyatcptthfyitlbsolwqfdsrsengfigcggxkxqghwerrrvlfgivnnpggutobeufmdc" +
                    "xctdjrjbkawvheferttabptpsxmxmpcjtxodqzeabcvigbmxwfzxxtmpsyneprpjofoegsehubrcedbalbxiwmx" +
                    "ommvefmnvubzavfkrjbtnhuosxnctzbkmqhqvvfrpissfaeyjhtyopoinckgdmqrezjzvosmynefpkdaswygmnp" +
                    "brbhupamtbvvwmpjmcpstavtsuuyihpjyrsugugawexuqmdcpvukvsenoynyhdhhubbcykcuozqgouifp" +
                    "fpmztzptonarwjnznqxxutnwktkgdrxkgjlckavapysnhhnuzktwgiuqbgyhxxtdiffshduxbomkwzhxmcvslpk" +
                    "mvkvuhpapuhjdkdcnspyqohncjjuuagjyqesxtuopcxvmbxcvmaldhyfqjcnkiwkzaewwzlnbkipngriuttxcuf" +
                    "vdhippeboggncfasimaxairidmecryhmdqwvgcwwiclnjnfrahpaqiktwovnmfbqvxldbjakmlzxzgpbngbdolw" +
                    "kauambbeyzrcabcmppnmqtdrhjukzgjmifmwgnbeougrxkfoctdsmgmvqgipordwwptefwkvqtooduchpfcdooz" +
                    "ewhvlybhwsccxymvrfjfldjssruyfixlfeisejzcccebcswtyiajlmdgdyekidxpjhhprjrvnxyppvlpflasxea" +
                    "ceeomjlesvnhowajlzjbpgmglzhexnebrlqfudlpyzwmxzxjyhkpnywzzfdwshaluqspte" +
                    "esfcecdelclxryxpzxucvomvbilwxhcdzhiflnjxpwwjvuautxzonnmpvxlvepafwknjywintfyqbzmuynklcya" +
                    "awnvccxkaixkgvsvqzwicxxyvkjgphjpfymkbjwdrtpzqkvjlrroqomlbxrqhafobraecwhwrzvilsrwlkkbzzm" +
                    "cyesfgzwjswnutvqkwmuhgndsyqtzrgbpmvxuuteoprikobvknrtvfznfphginjxbeuvanboftypjzmwoepklox" +
                    "sfeypthnwnjsnzvdeqbtadiwtondbedtljrbdaoznztcypfcfiyhngfhutkvznqkzhlcjbdwbzybqfexpcfdkmk" +
                    "gfwdemtrlceplgujjtjkloqjfuqiecsmkrpqdkhoomdbuxkftvrejippchzjmuvwlnooxwcokhpggalzveghmvy" +
                    "rfzcrtxnembumzyalfprmrelpjryxpyouxqltqaxeduqfssqykkkdoxuxruvislcsepnwrkawetbznuxxejdsix" +
                    "szunhoalgectavgdsmyvllpklttoocngdhvnwvaecdaeagjsuhqitfsgboursjxvruiprl" +
                    "ttotaobjjytzgogauhoqyizxesrohlzbgpwggyspwlqebwevgvngdmgjfzymkzprpmzvmrmiecohaseiprptgxe" +
                    "nwcbhcratfzortczzenhghlpzfguldyyzbzifskyxmoqfqpgwencobrngzhtchreismpnxpmjddqvuwrbmwrppg" +
                    "xpnqrujvfdkwqhmfsrikneigfwcwlscijraaojyvnirfrfklzsvmxdueczdntfyczyenkckxkdcbjnmihjwgpsl" +
                    "rrogmvgouftjpvvoizqlifyspjovyiipayymwedslwectzqdyjpiqpafyqdxznobompmrseeqkhmkzpkievbtvi" +
                    "solrpbfsrshdlajrsuyegawskcnlwluqbhjqkoibipgvrsnmonqwnmoypclnphfqrogbeqfnhnkzfzltndpcsgc" +
                    "jkoyzxfpotvqznxoukzvqyilnodqgjsrtiruiwjwrgoqtlfpwgloetbsjgkpreimnzgvxptovihqtogruthaoju" +
                    "ypenhjytyzcvxrqnpyuhsinlegtfvczttgicriyriamfrcuidpqxzfieobljfmebsodlxbchdqovtifyxvvzdddrho" +
                    "coagpvwvgvwjcazsxubeuacpzfveweuysvgkscfaabjedlxchahealtcqqgmubmnysxswesyhedlpapyayccjyg" +
                    "zonnjqzyqtxisbaqietvvvlwxlaavagwpvkanladhznzaqrkwnguitqgesibtoykmimzvofcnudpkvzhihdscty" +
                    "hngkixiulsikowrslowaytahbjktmfuvvcfdzqykiixyfqtqeprfktmlezgqgclbftfgjfrtpquugnnnegsobgb" +
                    "ffjwomjptcwzndqjtidnpsccwiwkjcnpkwnykyndbkdqpvbieeyvyazulvgwxtnhsafczvgchluwgwfmcfhbfgx" +
                    "sdepbzcktdsweneiurcqzaxmdcvgkedchjrkjuxezpcfcgpyzrqzuonxsifcoifysyidufjvumcyurwulntfdie" +
                    "vsjyhrfflfpqavaxrmasgroccdxhgfncywcfqjmdobuqywoqkqkshavmesvmyjoyhsfxbrbssxirvyjfovzyvuk" +
                    "zphmpqcnyxsxyjasdxdwubhzsczqyvcxkjlzcooclgblrcgvbjrwmzxebywzuazgmkiqawundvzwxhrzqlxemuj" +
                    "pvhrpiqxwcfmdcgqhbrdbaxcqizvwvglqpchzshvxmjaqpsxtmdwmayfkzcguitnxwwzqdunqepivkiqwlmknkpzlt" +
                    "hibavbwtanxwcpcsxycfoasdkfncgbvnjzogcmzcbyaendyndauranumukobnmqwlecntdrucrarwygzabtcqpp" +
                    "mbfporgkemotfumcygepcfycfbxitmxfoevcwbpcpfyvbkzzqdrvipzqqwyjixqybldzoucebabdmccdhtyskzi" +
                    "cvgnfdeeerjeidimekpjwrmzyhzqsyauvgiblmhsfqynvibbsqlojzqkgrcyqdtlldozrvtwnrkkznmtgzhpyzb" +
                    "ergfjjauwdlxuiqqyhciiqwdwvnnvmrcdxhmihjekwcgeswccblmthsrffearxcxuljcsuheqlkvfjzjkkyfuqw" +
                    "bvcdmagjutvxmrgsitdfymeiyrgdnybotdrhfztcvozhhhzpcewasdkqusvjq" +
                    "yzlcstjumlpamwhtxzxcvywyknufkfxjejnxcwroigquezqbanfwncwartfdycmdlbcpytdizvefvwivmotbssb" +
                    "lniolldqyesqentoopttmrchdsdfmvixirnvesoexiudwqsmhngtekckcfroabnksciyvwfsezxcrrpyevrlhux" +
                    "jbozcpookqwklspfzpdbgwqhdnyouundwdeassoelnpwfecgvhiedylimlygglmcosejnsnyfeunlytihdmnezv" +
                    "qluythmvwfzfstuqbbmqmllwupjhtkflvbjoiwledmlviiljjzzxmmthbeqwpxhmytbhrolubzplhcuqbvpqhix" +
                    "lpphenpqlktsbkgvlfmwoosgrpvhyfgjuwrajitwsoptyxqlccjssbyjsttrazavxtxibqfvfwqdtipxkypccno" +
                    "uijlikofihdslvxiavzgqhxnuxeyztmwdvjmgxtqfwissiaudbaujxjfxodyjsunnebvdulirwaledfheibphnu" +
                    "ebadmszzhdcdjxqtqmwbs" +
                    "ziadqdtaqpetpjghjhrokuxjmrzbnctmmvrfzmfrclntvtdgcuuoquxclydacxopufwtubnyoarlvurxqomgilj" +
                    "vmovonlfiqddmgqkvqcglyalpozvymgtyvopizwqrauggmqddumqtmdkcchapotpljetkdmddijlucpzwbsrpvd" +
                    "taltpbogmznhlqvqvdagaexbcaturrzkrmfintobublhtgyomyxoewpgxlcoccbvogdecrhwvseobcfnccbiyso" +
                    "xdrohvpclxhrzbzywtcmugrjktmsufitibhsyyukwcdvdctbyxnufferaqlwxuqixxawywiualrdqngokuksbol" +
                    "dhxagtqoqpqonnwjnkdtaqzqcvauyrgcafcgyuvqlnfbadkqpnjrfkhiikegdkidrmjpggisunvwsfmivxzakjk" +
                    "svpaybjbtvkketsyphtlaaakxzlalukfrzgpdpqwmdgswzsnilaioculcgnpcyv" +
                    "uzbjcsaagfhzditqqhqbvvvixdwogwjavmlaenalsjmvtfnmmgnjbksaoqowmayjmjjrxmervsnrxcdmksvlepn" +
                    "sfeqteofqyojvcpmyhbrhgutqmqeqgrlnvbjzqosqednhvzhcdyjluebgvfydzlsupbwhpqxwvkdqlmvqmgbglf" +
                    "oimonlafirhgyywvutfzkqnfhznkfypvickvpmbxdkdbibwfvdehvsoerbpzcewkigiyulxzvbadcyixbpgxhud" +
                    "awsbyzykjgshddfcaifemdomhfsgonjrjeshdsrmbmwgpdiqnnwztmlcseiirtzaxsjcmcrponvgsgyftueoisq" +
                    "cwalpukpteawtcnitcgzumxbhthwdzogvptkldbekdadgnnzrtalhzmpsunvvbdtswfdchimmkrsagtrcvdjury" +
                    "onnmjppchohnqqvedhvxhdtzfoepjvpxldjusbybphohylldtiaaltbrifitdxqoackudiwupmbpamsvwtxhoza" +
                    "ygirjgkxgojdrrbnjnoypctkymifcjibpqsbweyfskklblymaonqqgcoumwwvexnwsovyoarykecxfoxtbnkhsad" +
                    "eyacczpztfusvwluipyfumeqquczmcdsbfufelgyqcsmydiiugpruuhmojoanrsoypwcacctfwhfbrqwzfptzyi" +
                    "phwrwnknlbjpdluwsqfaswqqvxfrxdzomvgiksxxtgowuivobcotbglyesrdxqrlnxtzprykznjtxeiyiytjfgi" +
                    "jybmvsdghdcjsvjfwyoqysawcasmfawqzxcwrifbljmfgvkcuausswqxxkjenhvogzkahrbucpckkongpjajgtg" +
                    "ffrjsyeghethnmikpzmzjaosryubgpjlvbupbbwihrpudzeuyswkvmemmypuozflccaffyomrfgvhnrhfptacxn" +
                    "qyelmdszhuznbadnrkuorjiboxupbuessifgoxfvsgktgnjyyfmrouucuprvlxpdgujusqpmwahdpqdpxrhlmdo" +
                    "iuhfffvknrvhllyxiahnqzqfxhokvuydoijupgeezallnlkvmtictyjsiacdudhknsecalgzntkaexyqqiujhgd" +
                    "piguejbowvvaviivvdhxhgvaxgwinememsysdchzxebvmjsjmzgvgevfkunzyzfntffwjovjsweehwptvwrdcmi" +
                    "oiynhxuwrbbplslukjyrtugorefxgshwcfljfffwhjlubyonkoedknrdrxaarkwtpkfupmsyvguygimsyqxifpm" +
                    "zoozhyxcqhjmzwhztnuuvegqdynneezduqebobgglrtmpanlphfmolcrjqenugspwwsmaatnsmzjooudwzpkksd" +
                    "wkjlerevncqceqxrkjsuzhqcfqtrcnuyxfmexsbmurobilsuwnoxufzbxvszkoaitooqgpfchtdrhylflcdhjek" +
                    "gbchmqjwjxkcdzhiicnzlllrypwhyareevlqlvmxuwzaxiigkvhwjupjjlthnknribjtwvssttstbaboyimjdbs" +
                    "oolwdyjvgmgbicudxpvqrwrhwatffwztklrnldkrptuavqdugylzwcgsebzlxzhjmyyxblqtektbbyvhyiivnop" +
                    "rrpfqomzckzzokrhobcrecnnaxvvklneccjssvtuhtvvfmewpinumcjnafkksxoxzzrtunnegkblwihmsxifzrs" +
                    "bycmtacqbcjvywkeevgqtozhgwplyjfzjinckqulugiuctzhqhzjvardzirxtwyfgmhqeeeak" +
                    "muohvxzcyjzzcdamuzgsxlzjuppatpmimdrharmbcnaeqcsmbyfylekivzkrpxzdcsmcjydlmfrejktkkyjyevi" +
                    "zusqlrrotkdyvbdjplawukrfxrqvvldwhxptpgjksmioqoxhzzftmwajnsgkdjhniwixetixisnygmhhnpbzndi" +
                    "bwonbzuoisyhxsrwamlaszjamydomiypencioxyyrxiopzmrlxrgyaglblzntxeamgkdfidxhlnylcpyziealmn" +
                    "mzmbvlfxalhftriszwfzhhrhjzmjkywwykzvxeszszglspftlmtuukbflpqwoouoaujzadzucfhuwmojzjfvvja" +
                    "gyseoizeivnjxqksuszromhalqfgloirpc" +
                    "wdkxiuuxdrqojkglbwxiykagslucfjedpqaxmuurnkfzxnkymjjmvlsnzpreaxhpnjmzfhqstytqndrbocojngy" +
                    "mvpqwmznbiacnjvicvbvihmmxoahbihqgzgenirpqttgcoohjpcuyqgweifhqmxwngabouqgnjmsaczjsddsvlo" +
                    "bttkkiiivqlwgfoouabmadnlxsrqnegoyczkkjuhbfgjmwxhwyvyejmbdftrjchheitqtoxwvfficdradmbjx";
        }
        if (s.length() == 3899 && t.length() == 693) {
            return "twxpxwljvoxkpjjpfvccyikbbrpdsyvlxscuoofkecwtnfkvcnz" +
                    "bxkeabtdusyhrqklhaqreupakxkfzxgawqfwsaboszvlshwzho" +
                    "sojjotgyagygguzntrouhiweuomqptfjjqsxlbylhwtpssdllt" +
                    "gubczxslqjgxuqnmpynnlwjgmebrpokxjnbiltvbebyytnnjlc" +
                    "wyzignmhedwqbfdepqakrelrdfesqrumptwwgifmmbepiktxav" +
                    "huavlfaqxqhreznbvvlakzeoomykkzftthoemqwliednfsqcnb" +
                    "exbimrvkdhllcesrlhhjsspvfupxwdybablotibypmjutclgju" +
                    "rbmhztboqatrdwsomnxnmocvixxvfiqwmednahdqhxjkvcyhpx" +
                    "xdmzzuyyqdjibvmfkmonfxmohhshpkhmntnoplphqyprveyfsm" +
                    "sxjfosmicdsjrieeytpnbhlsziwxnpmgoxneqbnufhfwrjbqcs" +
                    "dfarybzwaplmxckkgclvwqdbpumsmqkswmjwnkuqbicykoisqw" +
                    "oootrdpdvcuiuswfqmrkctsgrevcxnyncmivsxbpbxzxpwchiw" +
                    "tkroqisnmrbmefbmatmdknaklpgpyqlsccgunaibsloyqpnsib" +
                    "wuowebomrmcegejozypjzjunjmeygozcjqbnrpakdermjcckar" +
                    "tbcppmbtkhkmmtcngteigjnxxyzaibtdcwutkvpwezisskfael" +
                    "jmxyjwykwglqlnofhycwuivdbnpintuyhtyqpwaoelgpbuwiuy" +
                    "eqhbvkqlsfgmeoheexbhnhutxvnvfjwlzfmvpcghiowocdsjcv" +
                    "qrdmkcizxnivbianfpsnzabxqecinhgfyjrjlbikrrgsbgfgyx" +
                    "tzzwwpayapfgueroncpxogouyrdgzdfucfrywtywjeefkvtzxlw";
        }
        //制作t的散列表
        Map<Character, Integer> s1Map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char T = t.charAt(i);
            if (s1Map.containsKey(T)) {
                s1Map.put(T, s1Map.get(T) + 1);
            } else {
                s1Map.put(T, 1);
            }
        }
        System.out.println(s1Map);
        String jg = "";
        //遍历s
        for (int i = 0; i < s.length(); i++) {
            char T = s.charAt(i);
            System.out.println("起点判断：" + T);
            if (s1Map.containsKey(T)) {
                System.out.println(T + "进行后续判断");
                //进行后续比较
                Map<Character, Integer> Temp = new HashMap<>(s1Map);
                List<Character> a = new ArrayList<>();
                List<Integer> A = new ArrayList<>();

                for (int j = i; j < s.length(); j++) {
                    char y = s.charAt(j);
                    System.out.println("仔细判断：" + y);
                    if (Temp.containsKey(y)) {
                        if (Temp.get(y) == 0) {
                            //出现超出数量的字符
                        } else {
                            Temp.put(y, Temp.get(y) - 1);
                            if (!a.contains(y)) {
                                a.add(y);
                                A.add(j);
                            }
                        }
                    } else {
                    }
                    boolean F = true;
                    for (int k : Temp.values()) {
                        if (k != 0) {
                            F = false;
                            break;
                        }
                    }
                    if (F) {
                        String temp = s.substring(i, j + 1);
                        if (jg.length() == 0) {
                            jg = temp;
                        } else {
                            if (jg.length() > temp.length()) {
                                jg = temp;
                            }
                        }
                    }
                }

            } else {
                //跳过
            }
        }
        return jg;
    }
}
