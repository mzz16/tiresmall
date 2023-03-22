const payAllId = document.querySelectorAll(".pay_tg_id");
const payAllGp = document.querySelectorAll(".pay_final_price");
const payAllFac = document.querySelectorAll(".pay_finalFac_price");

let payAllGpPrices = 0;
let payAllFacPrices = 0;

payAllGp.forEach((e) => {
  payAllGpPrices = payAllGpPrices + parseInt(e.value);
});

payAllFac.forEach((e) => {
  payAllFacPrices = payAllFacPrices + parseInt(e.value);
});

const payNavValue = document.querySelectorAll(".pay_nav_value");

payNavValue[0].innerText = `${payAllFacPrices.toLocaleString()}원`;
payNavValue[1].innerText = `${(
  payAllFacPrices - payAllGpPrices
).toLocaleString()}원`;
payNavValue[2].innerText = `${payAllGpPrices.toLocaleString()}원`;
