let board_contentType = document.querySelector(".board_contentType");
valueOfBCT = board_contentType.value;
let lengthOfBCT_withoutFileExtension = valueOfBCT.indexOf(".");
console.log(lengthOfBCT_withoutFileExtension);

content = valueOfBCT.substr(0, (lengthOfBCT_withoutFileExtension));
console.log(content);

const board_home = document.querySelector(".board_home");
const board_notice = document.querySelector(".board_notice");
const board_event = document.querySelector(".board_event");
const board_shoppingGuide = document.querySelector(".board_shoppingGuide");
const board_faq = document.querySelector(".board_faq");
const board_askBySite = document.querySelector(".board_askBySite");
const board_askByKakao = document.querySelector(".board_askByKakao");

if (content == "board_home") {
	board_home.classList.add("board_imHere");
} else if (content == "board_notice") {
	board_notice.classList.add("board_imHere");
} else if (content == "board_event") {
	board_event.classList.add("board_imHere");
} else if (content == "board_shoppingGuide") {
	board_shoppingGuide.classList.add("board_imHere");
} else if (content == "board_faq") {
	board_faq.classList.add("board_imHere");
} else if (content == "board_askBySite") {
	board_askBySite.classList.add("board_imHere");
} else if (content == "board_askByKakao") {
	board_askByKakao.classList.add("board_imHere");
}