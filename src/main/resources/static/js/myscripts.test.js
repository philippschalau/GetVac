import { mount } from '@vue/test-utils'
import MyScripts from './myscripts.js';
global.axios = require('axios');

test('should change the variable show from false to true when button is clicked', async () => {

    const wrapper = mount(MyScripts);
    wrapper.show = false;
    await wrapper.find('button').trigger('click');
    expect(wrapper.show).toBe(true);
})