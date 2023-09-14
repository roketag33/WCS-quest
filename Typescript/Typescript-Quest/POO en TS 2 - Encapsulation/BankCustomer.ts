import  assert  from  'assert';

class BankCustomers {
  private name: string;
  private cbNumber: string;

  constructor(name: string, cbNumber: string) {
    this.name = name;
    this.cbNumber = cbNumber;
  }

  public getName(): string {
    return this.name;
  }

  public verifyPinInput(pin: string): boolean {
    return pin === this.cbNumber ? true : false;
  }
}

// ... Ton code ici ...

// Tests

const customer = new BankCustomers('John Doe', '3579');
assert.equal(typeof customer.getName, 'function');
assert.equal(typeof customer.verifyPinInput, 'function');
assert.equal(customer.getName(), 'John Doe');
assert.ok(customer.verifyPinInput('3579'));