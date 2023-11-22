import axios from 'axios';

const API_BASE_URL = '';

const apiService = {
    getAllMedication: () => {
        return axios.get(`${API_BASE_URL}/medication`);
    },
    createData: (newData) => {
        return axios.post(`${API_BASE_URL}/data`, newData);
    }
};

export default apiService;