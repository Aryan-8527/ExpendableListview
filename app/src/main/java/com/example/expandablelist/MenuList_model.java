package com.example.expandablelist;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MenuList_model {
    @SerializedName("Data1")
    private List<Data1Model> data1;

    @SerializedName("data2")
    private List<Data2Model> data2;

    @SerializedName("data3")
    private List<Data3Model> data3;

    @SerializedName("data4")
    private List<Data4Model> data4;

    @SerializedName("data5")
    private List<Data5Model> data5;

    @SerializedName("data6")
    private List<Data6Model> data6;

    @SerializedName("data7")
    private List<Data7Model> data7;

    @SerializedName("data8")
    private List<Data8Model> data8;

    @SerializedName("data9")
    private List<Data9Model> data9;

    public List<Data1Model> getData1() {
        return data1;
    }

    public List<Data2Model> getData2() {
        return data2;
    }

    public List<Data3Model> getData3() {
        return data3;
    }

    public List<Data4Model> getData4() {
        return data4;
    }

    public List<Data5Model> getData5() {
        return data5;
    }

    public List<Data6Model> getData6() {
        return data6;
    }

    public List<Data7Model> getData7() {
        return data7;
    }

    public List<Data8Model> getData8() {
        return data8;
    }

    public List<Data9Model> getData9() {
        return data9;
    }

    public class Data1Model {
        @SerializedName("Role")
        private String role;

        @SerializedName("Home")
        private int home;

        @SerializedName("Dashboard")
        private int dashboard;

        @SerializedName("ApprovalCenter")
        private int approvalCenter;

        @SerializedName("TE_Claim")
        private int teClaim;

        @SerializedName("ManagerSelfService")
        private int managerSelfService;

        @SerializedName("Employee_Self_Service")
        private int employeeSelfService;

        @SerializedName("HR_Admin")
        private int hrAdmin;

        @SerializedName("Admin_Management")
        private int adminManagement;

        @SerializedName("CRM")
        private int crm;

        @SerializedName("CRM_Reports")
        private int crmReports;

        @SerializedName("Offer_Discount_Scheme")
        private int offerDiscountScheme;

        @SerializedName("Agent_Support")
        private int agentSupport;

        @SerializedName("OfficeAttendance")
        private int officeAttendance;

        @SerializedName("FAQ")
        private int faq;

        // Getter methods
        public String getRole() {
            return role;
        }

        public String getHome() {
            return String.valueOf(home);
        }

        public int getDashboard() {
            return dashboard;
        }

        public int getApprovalCenter() {
            return approvalCenter;
        }

        public int getTeClaim() {
            return teClaim;
        }

        public int getManagerSelfService() {
            return managerSelfService;
        }

        public int getEmployeeSelfService() {
            return employeeSelfService;
        }

        public int getHrAdmin() {
            return hrAdmin;
        }

        public int getAdminManagement() {
            return adminManagement;
        }

        public int getCrm() {
            return crm;
        }

        public int getCrmReports() {
            return crmReports;
        }

        public int getOfferDiscountScheme() {
            return offerDiscountScheme;
        }

        public int getAgentSupport() {
            return agentSupport;
        }

        public int getOfficeAttendance() {
            return officeAttendance;
        }

        public int getFaq() {
            return faq;
        }
    }

    public class Data2Model {
        @SerializedName("My_Attendance")
        private int myAttendance;
        @SerializedName("My_Incentive")
        private int myIncentive;

        public int getMyAttendance() {
            return myAttendance;
        }

        public void setMyAttendance(int myAttendance) {
            this.myAttendance = myAttendance;
        }

        public int getMyIncentive() {
            return myIncentive;
        }

        public void setMyIncentive(int myIncentive) {
            this.myIncentive = myIncentive;
        }
    }

    public class Data3Model {
        @SerializedName("SettleExpenses")
        private int settleExpenses ;
        @SerializedName("ApprovalCenter")
        private int approvalCenter ;

        public int getSettleExpenses() {
            return settleExpenses;
        }

        public int getApprovalCenter() {
            return approvalCenter;
        }
    }

    public class Data4Model {
        @SerializedName("SpendRequest")
        private int spendRequest;
        @SerializedName("Approval_Center")
        private int approvalCenter;
        @SerializedName("Reports")
        private int reports;
        @SerializedName("Global_Dashboard")
        private int globalDashboard;

        public int getSpendRequest() {
            return spendRequest;
        }

        public int getApprovalCenter() {
            return approvalCenter;
        }

        public int getReports() {
            return reports;
        }

        public int getGlobalDashboard() {
            return globalDashboard;
        }
    }

    public class Data5Model {
        @SerializedName("MyScheduledReports")
        private int myScheduledReports ;
        @SerializedName("OrderStatus")
        private int orderStatus ;
        @SerializedName("CreditLimitReport")
        private int creditLimitReport ;
        @SerializedName("OutstandingReport")
        private int outstandingReport ;
        @SerializedName("CustomerSales")
        private int customerSales ;

        public int getMyScheduledReports() {
            return myScheduledReports;
        }

        public int getOrderStatus() {
            return orderStatus;
        }

        public int getCreditLimitReport() {
            return creditLimitReport;
        }

        public int getOutstandingReport() {
            return outstandingReport;
        }

        public int getCustomerSales() {
            return customerSales;
        }
    }

    public class Data6Model {
        @SerializedName("LeadManagement")
        private int leadManagement;
        @SerializedName("Contacts")
        private int contacts;
        @SerializedName("Opportunity")
        private int opportunity;
        @SerializedName("BeatPlan")
        private int beatPlan;
        @SerializedName("SalesOrder")
        private int salesOrder;
        @SerializedName("OrderCenter")
        private int orderCenter;
        @SerializedName("ProductCatalogue")
        private int productCatalogue;
        @SerializedName("CustomerRegistration")
        private int customerRegistration;

        public int getLeadManagement() {
            return leadManagement;
        }

        public int getContacts() {
            return contacts;
        }

        public int getOpportunity() {
            return opportunity;
        }

        public int getBeatPlan() {
            return beatPlan;
        }

        public int getSalesOrder() {
            return salesOrder;
        }

        public int getOrderCenter() {
            return orderCenter;
        }

        public int getProductCatalogue() {
            return productCatalogue;
        }

        public int getCustomerRegistration() {
            return customerRegistration;
        }
    }

    public class Data7Model {
        @SerializedName("CheckInOut")
        private  int checkInOut;
        @SerializedName("ApplyLeave")
        private  int applyLeave;
        @SerializedName("HolidayCalendar")
        private  int holiday_calender;
        @SerializedName("MyAttendance")
        private  int myAttendance;
        @SerializedName("MyLeaveReport")
        private  int myLeaveReport;
        @SerializedName("MyIncentive")
        private  int myIncentive;
        @SerializedName("ClaimExpenses")
        private  int claimExpenses;

        public int getCheckInOut() {
            return checkInOut;
        }

        public int getApplyLeave() {
            return applyLeave;
        }

        public int getHoliday_calender() {
            return holiday_calender;
        }

        public int getMyAttendance() {
            return myAttendance;
        }

        public int getMyLeaveReport() {
            return myLeaveReport;
        }

        public int getMyIncentive() {
            return myIncentive;
        }

        public int getClaimExpenses() {
            return claimExpenses;
        }
    }

    public class Data8Model {
        @SerializedName("Team_Attendance")
        private int teamAttendance;
        @SerializedName("Team_Availability")
        private int teamAvaiablity;
        @SerializedName("Team_Whereabouts")
        private int teamWhereabouts;
        @SerializedName("TeamIncentive")
        private int teamIncentive;

        public int getTeamAttendance() {
            return teamAttendance;
        }

        public int getTeamAvaiablity() {
            return teamAvaiablity;
        }

        public int getTeamWhereabouts() {
            return teamWhereabouts;
        }

        public int getTeamIncentive() {
            return teamIncentive;
        }
    }

    public class Data9Model {
        @SerializedName("Attendance_Register")
        private int attendanceRegister;
        @SerializedName("Leave_Register")
        private int leaveRegister;
        @SerializedName("HR_MDM")
        private int hrMDM;
        @SerializedName("HolidayCalendar")
        private int holidayCalendar ;

        public int getAttendanceRegister() {
            return attendanceRegister;
        }

        public int getLeaveRegister() {
            return leaveRegister;
        }

        public int getHrMDM() {
            return hrMDM;
        }

        public int getHolidayCalendar() {
            return holidayCalendar;
        }
    }
}

