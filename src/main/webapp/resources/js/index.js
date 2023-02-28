const header = document.querySelector("header");
const topNav = document.querySelector(".index_topNav");
const dropMenu = document.querySelector(".index_dropMenu");
const indexShadow = document.querySelector(".index_shadow");
const searchMenu = document.querySelector(".index_tnSearch");
const brandMenu = document.querySelector(".index_tnBrand");
const storeMenu = document.querySelector(".index_tnStore");
const boardMenu = document.querySelector(".index_tnBoard");
const dropSearch = document.querySelector(".index_dropSearch");
const dropBrand = document.querySelector(".index_dropBrand");
const dropStore = document.querySelector(".index_dropStore");
const dropBoard = document.querySelector(".index_dropBoard");

topNav.addEventListener("mouseenter", () => {
  dropMenu.style.height = "100px";
  indexShadow.style.zIndex = "99";
});

header.addEventListener("mouseleave", () => {
  dropMenu.style.height = "0";
  indexShadow.style.zIndex = "-100";
});

searchMenu.addEventListener("mouseenter", () => {
  dropSearch.style.display = "block";
  dropBrand.style.display = "none";
  dropStore.style.display = "none";
  dropBoard.style.display = "none";
});

brandMenu.addEventListener("mouseenter", () => {
  dropBrand.style.display = "block";
  dropSearch.style.display = "none";
  dropStore.style.display = "none";
  dropBoard.style.display = "none";
});

storeMenu.addEventListener("mouseenter", () => {
  dropStore.style.display = "block";
  dropSearch.style.display = "none";
  dropBrand.style.display = "none";
  dropBoard.style.display = "none";
});

boardMenu.addEventListener("mouseenter", () => {
  dropBoard.style.display = "block";
  dropSearch.style.display = "none";
  dropBrand.style.display = "none";
  dropStore.style.display = "none";
});
