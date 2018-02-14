const chars = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "å", "ä", "ö", " ", ",", "."];


const stringToNumberList = str => {
    let list = [];
    for (let i = 0; i < str.length; i++) {
        list.push(chars.indexOf(str[i]))
    }
    return list;
}

const numberListToString = list => {
    let str = "";
    list.forEach(num => {
        str += chars[num]
    })
    return str;
}


const encrypt = (message, key) => {
    const messageList = stringToNumberList(message.toLowerCase().split("").filter(s => s.includes(s)));
    const keyList = stringToNumberList(key);

    return numberListToString(messageList.map((num, index) => ((num + keyList[index % keyList.length])) % chars.length))
}

const message = "Men solen stod över Liljeholmen och sköt hela kvastar av strålar mot öster, de gingo genom rökarne från Bergsund, de ilade fram över Riddarfjärden, klättrade upp till korset på Riddarholmskyrkan, kastade sig över till Tyskans branta tak, lekte med vimplarne på Skeppsbrobåtarne, illuminerade i fönstren på Stora Sjötullen, eklärerade Lidingöskogarne och tonade bort i ett rosenfärgat moln, långt, långt ut i fjärran, där havet ligger."
const key = "fan"

console.log(encrypt(message, key))