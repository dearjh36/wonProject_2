<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<html xmlns:th="http://www.thymeleaf.org">
  <head>
    <title>Main</title>
    <!-- bootstrap -->

    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    />
    <link rel="stylesheet" href="css/MainPageStyle.css" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  </head>
  <body>
    <header>
      <h2>#개의 목표 진행 중</h2>
      <nav>
        <ul>
          <!-- nav바 혹은 버튼으로 할지 선택.. -->
          <li>
            <button type="button" class="btn btn btn-default btn-space">
              가계부
            </button>
          </li>
          <li>
            <button type="button" class="btn btn btn-default btn-space">
              목표 목록
            </button>
          </li>
          <li>
            <button type="button" class="btn btn btn-default btn-space">
              내 정보
            </button>
          </li>
          <!-- <nav class="nav">
                    <a class="nav-link active" href="#">가계부</a>
                    <a class="nav-link" href="#">목표 목록</a>
                    <a class="nav-link" href="#">내 정보</a>
                    <a class="nav-link disabled" href="#">Disabled</a>
                </nav> -->
        </ul>
      </nav>
    </header>

    <form>
      <div class="goal-per-container">
        <button
          type="button"
          data-bs-toggle="tooltip"
          data-bs-placement="top"
          title="상세 페이지로 이동"
          class="goal-prt-btn btn btn-default btn-lg"
        ></button>
        <button
          type="button"
          data-bs-toggle="tooltip"
          data-bs-placement="top"
          title="상세 페이지로 이동"
          class="goal-prt-btn btn btn-default btn-lg"
        ></button>
      </div>
      <div style="margin-left: 90px">
        <input style="width: 150px" type="date" />
      </div>
      <!-- <div class="container text-center">
        <div class="row">
            <div class="col-md-1">
                <h3>날짜</h3>
                8/29 목
            </div>
            <div class="col-sm-2">
                <h3>수입</h3>
                <a id="money-income">1,000,000</a>
            </div>
            <div class="col-md-6">
                <h3>지출</h3>
                <a id="money-expenses">800,000</a>
            </div>
            <div class="col-sm-2">
                <h3>합계</h3>
                200,000
            </div>
        </div>
    </div> -->

      <!-- 스크롤 형식으로 구현? 일단 모양만 만들어두고 나중에 어떻게 할지 생각.. -->
      <div style="margin-left: 90px" class="acount-container align-center">
        <div class="temp-box box-one"><h3>날짜</h3></div>
        <div class="temp-box box-two"><h3>수입</h3></div>
        <div class="temp-box box-three"><h3>지출</h3></div>
        <div class="temp-box box-four"><h3>합계</h3></div>
        <div class="temp-box box-five">8/29 목</div>
        <div class="temp-box box-six">
          <a id="money-income">1,000,000</a>
        </div>
        <div class="temp-box box-seven">
          <a id="money-expenses">800,000</a>
        </div>
        <div class="temp-box box-eigth">200,000</div>
        <hr />
      </div>
      <div style="margin-left: 1100px" class="acount-container align-center">
        <!-- <button style="width: 120px; font-size: 13px;" type="button" class="btn btn btn-dark btn-space">가계부 내역추가</button> -->
      </div>
    </form>
  </body>
</html>
