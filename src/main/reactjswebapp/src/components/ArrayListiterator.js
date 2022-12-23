import React from 'react'

const ArrayListiterator = () => {
    const arr = ["Spring","Node","Java","Angular"];
  return (
    <div className="container">
    <div><h1>ArrayListiterator</h1></div>
        {
          arr.map(
            (value,index) => <li key={index}>{value}</li>
          )
        }
    </div>
  )
}

export default ArrayListiterator