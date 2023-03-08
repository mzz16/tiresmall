// 모달
const sizeBtn = document.querySelector(".detail_choose");
const methodBtn = document.querySelector(".detail_method");
const standardBtn = document.querySelector(".detail_standard");
const cartBtn = document.querySelector(".detail_cart");

sizeBtn.addEventListener("click", () => {
  const sizeSelector = document.querySelector(".detail_size_selector");
  sizeSelector.showModal();
});

methodBtn.addEventListener("click", () => {
  const sizeGuide = document.querySelector(".detail_size_guide");
  sizeGuide.showModal();
});

standardBtn.addEventListener("click", () => {
  const standardTable = document.querySelector(".detail_standard_table");
  standardTable.showModal();
});

cartBtn.addEventListener("click", () => {
  const cartDialog = document.querySelector(".detail_cart_dialog");
  cartDialog.showModal();
});

// 수량별 가격 변동
const plusBtn = document.querySelector(".detail_plus");
const minusBtn = document.querySelector(".detail_minus");
const input = document.querySelector(".detail_quantity_input");
const finalPrice = document.querySelector(".detail_final_price");
const notPrice = document.querySelector(".detail_not_price");

let intInput = parseInt(input.value);
let intFinalPrice = parseInt(
  finalPrice.innerText.replace("원", "").replace(",", "")
);
let intNotPrice = parseInt(
  notPrice.innerText.replace("원", "").replace(",", "")
);

plusBtn.addEventListener("click", () => {
  intInput++;
  input.value = intInput;
  const finalPriceValue = intFinalPrice * intInput;
  const notPriceValue = intNotPrice * intInput;
  finalPrice.innerText = `${finalPriceValue.toLocaleString()}원`;
  notPrice.innerText = `${notPriceValue.toLocaleString()}원`;
});

minusBtn.addEventListener("click", () => {
  if (intInput !== 1) {
    intInput--;
  }
  input.value = intInput;
  const finalPriceValue = intFinalPrice * intInput;
  const notPriceValue = intNotPrice * intInput;
  finalPrice.innerText = `${finalPriceValue.toLocaleString()}원`;
  notPrice.innerText = `${notPriceValue.toLocaleString()}원`;
});

// 상품정보 표시
const detail = document.querySelector(".detail_nav_detail");
const confirm = document.querySelector(".detail_nav_confirm");
const guide = document.querySelector(".detail_nav_guide");
const info = document.querySelector(".detail_nav_info");

const detailPage = document.querySelector(".detail_include_detail");
const confirmPage = document.querySelector(".detail_include_confirm");
const guidePage = document.querySelector(".detail_include_guide");
const infoPage = document.querySelector(".detail_include_info");

detail.addEventListener("click", () => {
  detailPage.style.display = "block";
  confirmPage.style.display = "none";
  guidePage.style.display = "none";
  infoPage.style.display = "none";
  detail.style.cssText = "color: var(--red); border-bottom-color: var(--red);";
  confirm.style.cssText = "color: black; border-bottom-color: white;";
  guide.style.cssText = "color: black; border-bottom-color: white;";
  info.style.cssText = "color: black; border-bottom-color: white;";
});

confirm.addEventListener("click", () => {
  confirmPage.style.display = "block";
  detailPage.style.display = "none";
  guidePage.style.display = "none";
  infoPage.style.display = "none";
  confirm.style.cssText = "color: var(--red); border-bottom-color: var(--red);";
  detail.style.cssText = "color: black; border-bottom-color: white;";
  guide.style.cssText = "color: black; border-bottom-color: white;";
  info.style.cssText = "color: black; border-bottom-color: white;";
});

guide.addEventListener("click", () => {
  guidePage.style.display = "block";
  confirmPage.style.display = "none";
  detailPage.style.display = "none";
  infoPage.style.display = "none";
  guide.style.cssText = "color: var(--red); border-bottom-color: var(--red);";
  detail.style.cssText = "color: black; border-bottom-color: white;";
  confirm.style.cssText = "color: black; border-bottom-color: white;";
  info.style.cssText = "color: black; border-bottom-color: white;";
});

info.addEventListener("click", () => {
  infoPage.style.display = "block";
  confirmPage.style.display = "none";
  guidePage.style.display = "none";
  detailPage.style.display = "none";
  info.style.cssText = "color: var(--red); border-bottom-color: var(--red);";
  detail.style.cssText = "color: black; border-bottom-color: white;";
  confirm.style.cssText = "color: black; border-bottom-color: white;";
  guide.style.cssText = "color: black; border-bottom-color: white;";
});
