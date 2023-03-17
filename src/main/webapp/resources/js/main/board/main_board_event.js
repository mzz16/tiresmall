const dialog = document.querySelector(".board_event_modal_dialog");
dialog.showModal();

dialog.addEventListener("close", () => {
	console.log(dialog.returnValue);
});