package com.example.expandablelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    private Adapter adapter;
    private HashMap<String, List<String>> expandableListChildItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView = findViewById(R.id.expandableListView);
        expandableListChildItem = new HashMap<>();

        makeApiRequest();
    }

    private void makeApiRequest() {
        String apiUrl = "http://ehubmccoy.mccoymine.com/api/getMenuList?Employee_Role=Manager";

        RequestQueue requestQueue = Volley.newRequestQueue(this);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET,
                apiUrl,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("TAG", "onResponse: "+response);
                        // Check if the response is not null
                        if (response != null) {
                            // Parse JSON response using Gson
                            Gson gson = new Gson();
                            MenuList_model menuList = gson.fromJson(response.toString(), MenuList_model.class);

                            if (menuList != null && menuList.getData1() != null) {
                                updateExpandableList(menuList);
                            }if (menuList != null && menuList.getData2() != null) {
                                updateExpandableList(menuList);
                            }if (menuList != null && menuList.getData3() != null) {
                                updateExpandableList(menuList);
                            }if (menuList != null && menuList.getData4() != null) {
                                updateExpandableList(menuList);
                            }if (menuList != null && menuList.getData5() != null) {
                                updateExpandableList(menuList);
                            }if (menuList != null && menuList.getData6() != null) {
                                updateExpandableList(menuList);
                            }if (menuList != null && menuList.getData7() != null) {
                                updateExpandableList(menuList);
                            }if (menuList != null && menuList.getData8() != null) {
                                updateExpandableList(menuList);
                            }if (menuList != null && menuList.getData9() != null) {
                                updateExpandableList(menuList);
                            }else {
                                Toast.makeText(MainActivity.this, "Error parsing data", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(MainActivity.this, "Empty response", Toast.LENGTH_SHORT).show();
                        }
                    }

                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                        Log.d("TAG", "onErrorResponse: "+error.getMessage());
                    }
                }
        );
        requestQueue.add(jsonObjectRequest);
    }


    private void updateExpandableList(MenuList_model menuList) {


        expandableListChildItem.put("DATA 1", getDataList(menuList.getData1()));
        expandableListChildItem.put("DATA 2" , getDataList2(menuList.getData2()));
        expandableListChildItem.put("DATA 3" , getDataList3(menuList.getData3()));
        expandableListChildItem.put("DATA 4" , getDataList4(menuList.getData4()));
        expandableListChildItem.put("DATA 5" , getDataList5(menuList.getData5()));
        expandableListChildItem.put("DATA 6" , getDataList6(menuList.getData6()));
        expandableListChildItem.put("DATA 7" , getDataList7(menuList.getData7()));
        expandableListChildItem.put("DATA 8" , getDataList8(menuList.getData8()));
        expandableListChildItem.put("DATA 9" , getDataList9(menuList.getData9()));


        // Initialize the adapter and set it on the ExpandableListView
        adapter = new Adapter(this, new ArrayList<>(expandableListChildItem.keySet()), expandableListChildItem);
        expandableListView.setAdapter(adapter);
    }

    private List<String> getDataList(List<? extends MenuList_model.Data1Model> dataList) {
        List<String> data = new ArrayList<>();
        for (MenuList_model.Data1Model item : dataList) {

//            data.add(item.getRole());
            data.add("Home "+item.getHome());
            data.add(String.valueOf("Dashboard "+item.getDashboard()));
            data.add(String.valueOf("Approval Center "+item.getApprovalCenter()));
            data.add(String.valueOf("TE Claim " +item.getTeClaim()));
            data.add(String.valueOf("Manager Self Service "+item.getManagerSelfService()));
            data.add(String.valueOf("Employee Self Service "+ item.getEmployeeSelfService()));
            data.add(String.valueOf("Hr Admin" + item.getHrAdmin()));
            data.add(String.valueOf("Admin Management"+ item.getAdminManagement()));
            data.add(String.valueOf("Crm"+item.getCrm()));
            data.add(String.valueOf("Crm Reports "+item.getCrmReports()));
            data.add(String.valueOf("Offer Discount Scheme "+item.getOfferDiscountScheme()));
            data.add(String.valueOf("Agent Support "+item.getAgentSupport()));
            data.add(String.valueOf("Office Attendance "+item.getOfficeAttendance()));
            data.add(String.valueOf("Faq "+item.getFaq()));
        }
        return data;
    }
    private List<String> getDataList2(List<? extends MenuList_model.Data2Model> dataList) {
        List<String> data = new ArrayList<>();
        for (MenuList_model.Data2Model item : dataList) {
            // Customize this based on your model structure
            data.add(String.valueOf("My Attendance "+item.getMyAttendance()));
            data.add(String.valueOf("My Incentive "+item.getMyIncentive()));
        }
        return data;
    }
    private List<String> getDataList3(List<? extends MenuList_model.Data3Model> dataList) {
        List<String> data = new ArrayList<>();
        for (MenuList_model.Data3Model item : dataList) {
            data.add(String.valueOf("Settle Expenses "+item.getSettleExpenses()));
            data.add(String.valueOf("Approval Center "+item.getApprovalCenter()));
        }
        return data;
    }
    private List<String> getDataList4(List<? extends MenuList_model.Data4Model> dataList) {
        List<String> data = new ArrayList<>();
        for (MenuList_model.Data4Model item : dataList) {
            data.add(String.valueOf("Spend Request "+item.getSpendRequest()));
            data.add(String.valueOf("Approval Center "+item.getApprovalCenter()));
            data.add(String.valueOf("Reports "+item.getReports()));
            data.add(String.valueOf("Global Dashboard "+item.getGlobalDashboard()));
        }
        return data;
    }
    private List<String> getDataList5(List<? extends MenuList_model.Data5Model> dataList) {
        List<String> data = new ArrayList<>();
        for (MenuList_model.Data5Model item : dataList) {
            data.add(String.valueOf("My Scheduled Reports" +item.getMyScheduledReports()));
            data.add(String.valueOf("Order Status" +item.getOrderStatus()));
            data.add(String.valueOf("Credit Limit Report" +item.getCreditLimitReport()));
            data.add(String.valueOf("Outstanding Report" +item.getOutstandingReport()));
            data.add(String.valueOf("Customer Sales" +item.getCustomerSales()));
        }
        return data;
    }
    private List<String> getDataList6(List<? extends MenuList_model.Data6Model> dataList) {
        List<String> data = new ArrayList<>();
        for (MenuList_model.Data6Model item : dataList) {
            data.add(String.valueOf("Lead Management "+ item.getLeadManagement()));
            data.add(String.valueOf("Contacts "+ item.getContacts()));
            data.add(String.valueOf("Opportunity "+ item.getOpportunity()));
            data.add(String.valueOf("BeatPlan "+ item.getBeatPlan()));
            data.add(String.valueOf("Sales Order" + item.getSalesOrder()));
            data.add(String.valueOf("Order Center" + item.getOrderCenter()));
            data.add(String.valueOf("Product Catalogue" + item.getProductCatalogue()));
            data.add(String.valueOf("Customer Registration" + item.getCustomerRegistration()));
        }
        return data;
    }

    private List<String> getDataList7(List<? extends MenuList_model.Data7Model> dataList) {
        List<String> data = new ArrayList<>();
        for (MenuList_model.Data7Model item : dataList) {
            data.add(String.valueOf("Check In Out" +item.getCheckInOut()));
            data.add(String.valueOf("Apply Leave" +item.getApplyLeave()));
            data.add(String.valueOf("Holiday calender" +item.getHoliday_calender()));
            data.add(String.valueOf("My Attendance" +item.getMyAttendance()));
            data.add(String.valueOf("My LeaveReport" +item.getMyLeaveReport()));
            data.add(String.valueOf("My Incentive" +item.getMyIncentive()));
            data.add(String.valueOf("Claim Expenses" +item.getClaimExpenses()));
        }
        return data;
    }

    private List<String> getDataList8(List<? extends MenuList_model.Data8Model> dataList) {
        List<String> data = new ArrayList<>();
        for (MenuList_model.Data8Model item : dataList) {
            data.add(String.valueOf("Team Attendance " +item.getTeamAttendance()));
            data.add(String.valueOf("Team Avaiablity" + item.getTeamAvaiablity()));
            data.add(String.valueOf("Team Whereabouts" +item.getTeamWhereabouts()));
            data.add(String.valueOf("Team Incentive" +item.getTeamIncentive()));
        }
        return data;
    }

    private List<String> getDataList9(List<? extends MenuList_model.Data9Model> dataList) {
        List<String> data = new ArrayList<>();
        for (MenuList_model.Data9Model item : dataList) {

            data.add(String.valueOf("Attendance Register" + item.getAttendanceRegister()));
            data.add(String.valueOf("Leave Register" + item.getLeaveRegister()));
            data.add(String.valueOf("Hr MDM" + item.getHrMDM()));
            data.add(String.valueOf("Holiday Calender" + item.getHolidayCalendar()));
        }
        return data;
    }
}
