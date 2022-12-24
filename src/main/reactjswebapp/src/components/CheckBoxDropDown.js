import React, { useState } from 'react'

const CheckBoxDropDown = () => {
    const [textArea,setTextArea] = useState("");
    const [selectMenu,setSelectMenu] = useState("");
    const [checked,setChecked] = useState(false);
    const handleSubmit = (e) => {
        e.preventDefault();
        console.log('Comments: ', e.target[0].value);
        console.log('Country: ', e.target[1].value);
        console.log('Check Box value : ', e.target[2].checked);
    }
  return (
    <div>
        <hr />
        <form onSubmit={handleSubmit}>
            <label style={{verticalAlign:"top"}} htmlFor="">Comments:</label>
            <textarea value={textArea} onChange={(e) => setTextArea(e.target.value)} cols="5" rows="10"></textarea>
            <br /> <br />
            <select value={selectMenu} onChange={(e) => setSelectMenu(e.target.value)}>
                <option value="Canada">Canada</option>
                <option value="USA">USA</option>
                <option value="UK">UK</option>
                <option value="India">India</option>
            </select>
            <br /> <br />
            <input type="checkbox" checked={checked} onChange={ (e) => setChecked(e.target.checked)} />
            <br /> <br />
            <input  type="submit" value="Submit" />
        </form>
    </div>
  )
}

export default CheckBoxDropDown