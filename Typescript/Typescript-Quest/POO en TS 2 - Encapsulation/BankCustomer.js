"use strict";
exports.__esModule = true;
var assert_1 = require("assert");
var BankCustomers = /** @class */ (function () {
    function BankCustomers(name, cbNumber) {
        this.name = name;
        this.cbNumber = cbNumber;
    }
    BankCustomers.prototype.getName = function () {
        return this.name;
    };
    BankCustomers.prototype.verifyPinInput = function (pin) {
        return pin === this.cbNumber ? true : false;
    };
    return BankCustomers;
}());
// ... Ton code ici ...
// Tests
var customer = new BankCustomers('John Doe', '3579');
assert_1["default"].equal(typeof customer.getName, 'function');
assert_1["default"].equal(typeof customer.verifyPinInput, 'function');
assert_1["default"].equal(customer.getName(), 'John Doe');
assert_1["default"].ok(customer.verifyPinInput('3579'));
