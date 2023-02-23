const header = document.querySelector("header");
const topNav = document.querySelector(".index_topNav");
const dropMenu = document.querySelector(".index_dropMenu");
const shadow = document.querySelector(".index_shadow");
const searchMenu = document.querySelector(".index_tnSearch");
const brandMenu = document.querySelector(".index_tnBrand");
const storeMenu = document.querySelector(".index_tnStore");
const dropSearch = document.querySelector(".index_dropSearch");
const dropBrand = document.querySelector(".index_dropBrand");
const dropStore = document.querySelector(".index_dropStore");

topNav.addEventListener("mouseenter", () => {
  dropMenu.style.height = "100px";
  shadow.style.zIndex = "0";
});

header.addEventListener("mouseleave", () => {
  dropMenu.style.height = "0";
  shadow.style.zIndex = "-1";
});

searchMenu.addEventListener("mouseenter", () => {
  dropSearch.style.display = "block";
  dropBrand.style.display = "none";
  dropStore.style.display = "none";
});

brandMenu.addEventListener("mouseenter", () => {
  dropBrand.style.display = "block";
  dropSearch.style.display = "none";
  dropStore.style.display = "none";
});

storeMenu.addEventListener("mouseenter", () => {
  dropStore.style.display = "block";
  dropSearch.style.display = "none";
  dropBrand.style.display = "none";
});
