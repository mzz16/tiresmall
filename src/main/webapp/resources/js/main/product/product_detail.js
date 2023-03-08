const sizeBtn = document.querySelector(".detail_choose");
const methodBtn = document.querySelector(".detail_method");
const standardBtn = document.querySelector(".detail_standard");

sizeBtn.addEventListener("click", () => {
  const sizeSelector = document.querySelector(".detail_size_selector");
  sizeSelector.showModal();
});

methodBtn.addEventListener("click", () => {
  const sizeGuide = document.querySelector(".detail_size_guide");
  sizeGuide.showModal();
});
