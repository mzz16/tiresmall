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
  resetDetailInclude();
  detail.classList.add("detail_nav_li_active");
  detailPage.style.display = "block";
});

confirm.addEventListener("click", () => {
  resetDetailInclude();
  confirm.classList.add("detail_nav_li_active");
  confirmPage.style.display = "block";
});

guide.addEventListener("click", () => {
  resetDetailInclude();
  guide.classList.add("detail_nav_li_active");
  guidePage.style.display = "block";
});

info.addEventListener("click", () => {
  resetDetailInclude();
  info.classList.add("detail_nav_li_active");
  infoPage.style.display = "block";
});

function resetDetailInclude() {
  detailPage.style.display = "none";
  confirmPage.style.display = "none";
  guidePage.style.display = "none";
  infoPage.style.display = "none";
  detail.classList.remove("detail_nav_li_active");
  confirm.classList.remove("detail_nav_li_active");
  guide.classList.remove("detail_nav_li_active");
  info.classList.remove("detail_nav_li_active");
}

// 장바구니 ajax
const tg_id = document.querySelector(".tg_id").value;
const tg_brand = document.querySelector(".tg_brand").value;
const tg_name = document.querySelector(".tg_name").value;
const tg_img = document.querySelector(".tg_img").value;
const tg_dcrate = document.querySelector(".tg_dcrate").value;
const ti_width = document.querySelector(".ti_width").value;
const ti_ratio = document.querySelector(".ti_ratio").value;
const ti_inch = document.querySelector(".ti_inch").value;

cartBtn.addEventListener("click", () => {
  const ti_stock = document.querySelector(".detail_quantity_input").value;
  const ti_pricegp = document
    .querySelector(".detail_not_price")
    .innerText.replace("원", "")
    .replace(",", "");
  const ti_pricefac = document
    .querySelector(".detail_final_price")
    .innerText.replace("원", "")
    .replace(",", "");

  const cartDTO = {
    tg_id,
    tg_brand,
    tg_name,
    tg_img,
    tg_dcrate,
    ti_width,
    ti_ratio,
    ti_inch,
    ti_stock,
    ti_pricegp,
    ti_pricefac,
  };

  // 장바구니 추가
  $.ajax({
    url: "cart.add",
    type: "POST",
    data: cartDTO,
    success: function (result) {
      if (result === 1) {
        const cartDialog = document.querySelector(".detail_cart_dialog");
        cartDialog.showModal();
      }
    },
  });
});
