const homeShadow = document.querySelectorAll(".home_shadow");
const img = document.querySelectorAll(".home_recommend_img");

homeShadow[0].addEventListener("mouseenter", () => {
  img[0].style.transform = "scale(1.1)";
});

homeShadow[1].addEventListener("mouseenter", () => {
  img[1].style.transform = "scale(1.1)";
});

homeShadow[0].addEventListener("mouseleave", () => {
  img[0].style.transform = "scale(1)";
});

homeShadow[1].addEventListener("mouseleave", () => {
  img[1].style.transform = "scale(1)";
});
