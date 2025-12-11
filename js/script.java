// Select elements
const hamMenu = document.querySelector(".ham-menu");
const offScreenMenu = document.querySelector(".off-screen-menu");

// Toggle menu open/close
hamMenu.addEventListener("click", () => {
  const expanded = hamMenu.getAttribute("aria-expanded") === "true";

  // Update accessibility attribute
  hamMenu.setAttribute("aria-expanded", !expanded);

  // Toggle classes
  hamMenu.classList.toggle("active");
  offScreenMenu.classList.toggle("active");
});

// Close menu when a link is clicked
document.querySelectorAll(".off-screen-menu a").forEach(link => {
  link.addEventListener("click", () => {
    hamMenu.classList.remove("active");
    offScreenMenu.classList.remove("active");
    hamMenu.setAttribute("aria-expanded", false);
  });
});