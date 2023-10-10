function Main(){
   const leftBtnClick = ()=>{
    alert(1);
  }

  return(
    <main>
      <div>
        <button onClick={leftBtnClick}>-</button>
        <span>1 / 13</span>
        <button>+</button>
      </div>
    </main>
  )
}
export default Main;