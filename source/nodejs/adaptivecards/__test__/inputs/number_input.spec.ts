import {NumberInput} from "../../src/card-elements";

test('NumberInput should be instantiated', ()=>{
    const numberInput = new NumberInput();
    expect(numberInput).toEqual(expect.anything());
})