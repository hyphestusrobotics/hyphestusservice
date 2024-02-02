/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["../resources/templates/**/*.{html,js}"], // it will be explained later
  plugins: [
      require('tailwindcss-animated')
    ],
  theme: {
    extend: {
        colors :{
                "white" : "#FFFFFF",
                "black"  : "#000000",
                "lightgray" : "#EEEEEE",
                "blue" : "#173253",
                "red" : "#ff0e36",
                "lightblack" : "#141414",
                "black_end" : "#252525",
                "purple" : "#502784",
                "redonebg" : "#dd2628",
              },
    },
  },
}
