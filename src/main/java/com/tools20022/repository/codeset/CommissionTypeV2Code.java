/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CommissionTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of service for which the commission is asked or paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#ClientDirected
 * CommissionTypeV2Code.mmClientDirected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#StepOut
 * CommissionTypeV2Code.mmStepOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#FrontEndLoad
 * CommissionTypeV2Code.mmFrontEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#Initial
 * CommissionTypeV2Code.mmInitial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#BackEndLoad
 * CommissionTypeV2Code.mmBackEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#Trailer
 * CommissionTypeV2Code.mmTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#Regular
 * CommissionTypeV2Code.mmRegular}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#StepIn
 * CommissionTypeV2Code.mmStepIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#SoftDollar
 * CommissionTypeV2Code.mmSoftDollar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#SoftDollarStepIn
 * CommissionTypeV2Code.mmSoftDollarStepIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#SoftDollarStepOut
 * CommissionTypeV2Code.mmSoftDollarStepOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#PlanSponsor
 * CommissionTypeV2Code.mmPlanSponsor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#PercentageOfPrincipal
 * CommissionTypeV2Code.mmPercentageOfPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#Markup
 * CommissionTypeV2Code.mmMarkup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#CommissionDePlacement
 * CommissionTypeV2Code.mmCommissionDePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#BrokerCredit
 * CommissionTypeV2Code.mmBrokerCredit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#Other
 * CommissionTypeV2Code.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#FundBasedRenewal
 * CommissionTypeV2Code.mmFundBasedRenewal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#FlatFee
 * CommissionTypeV2Code.mmFlatFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#PointsPerBondOrContract
 * CommissionTypeV2Code.mmPointsPerBondOrContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#DifferentialOrDeferredPayment
 * CommissionTypeV2Code.mmDifferentialOrDeferredPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#BrokerageRate
 * CommissionTypeV2Code.mmBrokerageRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#PerUnit
 * CommissionTypeV2Code.mmPerUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#PercentageCommissionWaivedAsCashDiscount
 * CommissionTypeV2Code.mmPercentageCommissionWaivedAsCashDiscount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code#PercentageCommissionWaivedAsAdditionalUnits
 * CommissionTypeV2Code.mmPercentageCommissionWaivedAsAdditionalUnits}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CLDI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommissionTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of service for which the commission is asked or paid."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CommissionTypeV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Commission is as per client agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientDirected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is as per client agreement."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code ClientDirected = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClientDirected";
			definition = "Commission is as per client agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "CLDI";
		}
	};
	/**
	 * Commission for a step-out trade, charged by the step-out broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission for a step-out trade, charged by the step-out broker."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code StepOut = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StepOut";
			definition = "Commission for a step-out trade, charged by the step-out broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "STEP";
		}
	};
	/**
	 * Commission for subscribing to an investment, paid at the time of the
	 * subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission for subscribing to an investment, paid at the time of the subscription."
	 * </li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code FrontEndLoad = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FrontEndLoad";
			definition = "Commission for subscribing to an investment, paid at the time of the subscription.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "FEND";
		}
	};
	/**
	 * Commission paid at the time of first subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission paid at the time of first subscription."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code Initial = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Initial";
			definition = "Commission paid at the time of first subscription.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "INIT";
		}
	};
	/**
	 * Commission for redeeming an investment, when an investor redeems an
	 * investment fund within a certain period of time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission for redeeming  an investment, when an investor redeems an investment fund within a certain period of time."
	 * </li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code BackEndLoad = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BackEndLoad";
			definition = "Commission for redeeming  an investment, when an investor redeems an investment fund within a certain period of time.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "BEND";
		}
	};
	/**
	 * Commission that is calculated on the position of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission that is calculated on the position of an account."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code Trailer = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trailer";
			definition = "Commission that is calculated on the position of an account.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "TRAI";
		}
	};
	/**
	 * Commission that is regular.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regular"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission that is regular."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code Regular = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Regular";
			definition = "Commission that is regular.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "REGU";
		}
	};
	/**
	 * Commission for a step-in trade, charged by the step-in broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission for a step-in trade, charged by the step-in broker."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code StepIn = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StepIn";
			definition = "Commission for a step-in trade, charged by the step-in broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "STEI";
		}
	};
	/**
	 * Commission designated by the broker for third party services. The soft
	 * dollar arrangement refers to an arrangement wherean investment manager
	 * directs transactions to a brokerand, in exchange, the broker provides
	 * brokerage and research services to the investment manager. Soft dollar
	 * arrangements include proprietary and third party research arrangements,
	 * but do not include client-directed brokerage arrangements. The U.S.
	 * Securities Exchange Act of 1934, Section 238(e), created a "safe harbor"
	 * to protect investment managers from claims that they had breached their
	 * fiduciary duties by using their client commissions to pay a higher
	 * commission than they might have paid for execution services to acquire
	 * investment research. The SEC defines soft dollars as: The Commission has
	 * defined soft dollar practices as arrangements under which products or
	 * services, other than execution of securities transactions, are obtained
	 * through an adviser or a broker-dealer in exchange for the direction by
	 * the adviser of client brokerage transactions to the broker-dealer. An
	 * individual or firm must exercise "investment discretion" over an account,
	 * as defined in Section 3(a)(35) of the Exchange Act, in order to use
	 * client commissions to obtain research under Section 28(e) of the Exchange
	 * Act ("Section 28(e)").
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftDollar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission designated by the broker for third party services. The soft dollar arrangement refers to an arrangement wherean investment manager directs transactions to a brokerand, in exchange, the broker provides brokerage and research services to the investment manager. Soft dollar arrangements include proprietary and third party research arrangements, but do not include client-directed brokerage arrangements. The U.S. Securities Exchange Act of 1934, Section 238(e), created a \"safe harbor\" to protect investment managers from claims that they had breached their fiduciary duties by using their client commissions to pay a higher commission than they might have paid for execution services to acquire investment research. The SEC defines soft dollars as: The Commission has defined soft dollar practices as arrangements under which products or services, other than execution of securities transactions, are obtained through an adviser or a broker-dealer in exchange for the direction by the adviser of client brokerage transactions to the broker-dealer. An individual or firm must exercise \"investment discretion\" over an account, as defined in Section 3(a)(35) of the Exchange Act, in order to use client commissions to obtain research under Section 28(e) of the Exchange Act (\"Section 28(e)\")."
	 * </li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code SoftDollar = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SoftDollar";
			definition = "Commission designated by the broker for third party services. The soft dollar arrangement refers to an arrangement wherean investment manager directs transactions to a brokerand, in exchange, the broker provides brokerage and research services to the investment manager. Soft dollar arrangements include proprietary and third party research arrangements, but do not include client-directed brokerage arrangements. The U.S. Securities Exchange Act of 1934, Section 238(e), created a \"safe harbor\" to protect investment managers from claims that they had breached their fiduciary duties by using their client commissions to pay a higher commission than they might have paid for execution services to acquire investment research. The SEC defines soft dollars as: The Commission has defined soft dollar practices as arrangements under which products or services, other than execution of securities transactions, are obtained through an adviser or a broker-dealer in exchange for the direction by the adviser of client brokerage transactions to the broker-dealer. An individual or firm must exercise \"investment discretion\" over an account, as defined in Section 3(a)(35) of the Exchange Act, in order to use client commissions to obtain research under Section 28(e) of the Exchange Act (\"Section 28(e)\").";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "SOFT";
		}
	};
	/**
	 * Commission that combines soft dollar and step-in commission
	 * characteristics.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftDollarStepIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission that combines soft dollar and step-in commission characteristics."
	 * </li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code SoftDollarStepIn = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SoftDollarStepIn";
			definition = "Commission that combines soft dollar and step-in commission characteristics.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "SOIN";
		}
	};
	/**
	 * Commission that combines soft dollar and step-out commission
	 * characteristics.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftDollarStepOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission that combines soft dollar and step-out commission characteristics."
	 * </li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code SoftDollarStepOut = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SoftDollarStepOut";
			definition = "Commission that combines soft dollar and step-out commission characteristics.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "SOUT";
		}
	};
	/**
	 * Commission for a plan sponsor's services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlanSponsor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission for a plan sponsor's services."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code PlanSponsor = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlanSponsor";
			definition = "Commission for a plan sponsor's services.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "PLAN";
		}
	};
	/**
	 * Commission is a percentage of principal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PERN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is a percentage of principal."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code PercentageOfPrincipal = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageOfPrincipal";
			definition = "Commission is a percentage of principal.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "PERN";
		}
	};
	/**
	 * Amount or percentage that is added to an offer price when an investor
	 * buys from a broker or market maker. In this case, the price is adjusted
	 * to reflect changing market conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Markup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount or percentage that is added to an offer price when an investor buys from a broker or market maker.  In this case, the price is adjusted to reflect changing market conditions."
	 * </li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code Markup = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Markup";
			definition = "Amount or percentage that is added to an offer price when an investor buys from a broker or market maker.  In this case, the price is adjusted to reflect changing market conditions.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "MARK";
		}
	};
	/**
	 * Amount of cash due to an intermediary for selling a product, or services,
	 * to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDePlacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash due to an intermediary for selling a product, or services, to a third party."
	 * </li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code CommissionDePlacement = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommissionDePlacement";
			definition = "Amount of cash due to an intermediary for selling a product, or services, to a third party.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "CDPL";
		}
	};
	/**
	 * Amount financed to cover the back-end load.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount financed to cover the back-end load."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code BrokerCredit = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BrokerCredit";
			definition = "Amount financed to cover the back-end load.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "BCRD";
		}
	};
	/**
	 * Commission is another type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is another type of transaction."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code Other = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Commission is another type of transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Annual fund based renewal commission, expressed as a percentage of the
	 * deal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RNEW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundBasedRenewal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Annual fund based renewal commission, expressed as a percentage of the deal."
	 * </li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code FundBasedRenewal = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundBasedRenewal";
			definition = "Annual fund based renewal commission, expressed as a percentage of the deal.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "RNEW";
		}
	};
	/**
	 * Commission is a flat fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlatFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is a flat fee."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code FlatFee = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlatFee";
			definition = "Commission is a flat fee.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "FLAT";
		}
	};
	/**
	 * Commission is based on points per bond or contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PBOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointsPerBondOrContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is based on points per bond or contract."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code PointsPerBondOrContract = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PointsPerBondOrContract";
			definition = "Commission is based on points per bond or contract.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "PBOC";
		}
	};
	/**
	 * Differential or deferred payment commission rate.  
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentialOrDeferredPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Differential or deferred payment commission rate.  "</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code DifferentialOrDeferredPayment = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentialOrDeferredPayment";
			definition = "Differential or deferred payment commission rate.  ";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "DFDP";
		}
	};
	/**
	 * Brokerage commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRKR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerageRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Brokerage commission."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code BrokerageRate = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerageRate";
			definition = "Brokerage commission.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "BRKR";
		}
	};
	/**
	 * Commission is per unit of financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PERU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is per unit of financial instrument."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code PerUnit = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerUnit";
			definition = "Commission is per unit of financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "PERU";
		}
	};
	/**
	 * Commission is a percentage commission waived as cash discount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PWCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageCommissionWaivedAsCashDiscount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission is a percentage commission waived as cash discount."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code PercentageCommissionWaivedAsCashDiscount = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageCommissionWaivedAsCashDiscount";
			definition = "Commission is a percentage commission waived as cash discount.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "PWCD";
		}
	};
	/**
	 * Commission is a percentage commission waived as additional units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PWEU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageCommissionWaivedAsAdditionalUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission is a percentage commission waived as additional units."</li>
	 * </ul>
	 */
	public static final CommissionTypeV2Code PercentageCommissionWaivedAsAdditionalUnits = new CommissionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageCommissionWaivedAsAdditionalUnits";
			definition = "Commission is a percentage commission waived as additional units.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeV2Code.mmObject();
			codeName = "PWEU";
		}
	};
	final static private LinkedHashMap<String, CommissionTypeV2Code> codesByName = new LinkedHashMap<>();

	protected CommissionTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CLDI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommissionTypeV2Code";
				definition = "Type of service for which the commission is asked or paid.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CommissionTypeV2Code.ClientDirected, com.tools20022.repository.codeset.CommissionTypeV2Code.StepOut,
						com.tools20022.repository.codeset.CommissionTypeV2Code.FrontEndLoad, com.tools20022.repository.codeset.CommissionTypeV2Code.Initial, com.tools20022.repository.codeset.CommissionTypeV2Code.BackEndLoad,
						com.tools20022.repository.codeset.CommissionTypeV2Code.Trailer, com.tools20022.repository.codeset.CommissionTypeV2Code.Regular, com.tools20022.repository.codeset.CommissionTypeV2Code.StepIn,
						com.tools20022.repository.codeset.CommissionTypeV2Code.SoftDollar, com.tools20022.repository.codeset.CommissionTypeV2Code.SoftDollarStepIn, com.tools20022.repository.codeset.CommissionTypeV2Code.SoftDollarStepOut,
						com.tools20022.repository.codeset.CommissionTypeV2Code.PlanSponsor, com.tools20022.repository.codeset.CommissionTypeV2Code.PercentageOfPrincipal, com.tools20022.repository.codeset.CommissionTypeV2Code.Markup,
						com.tools20022.repository.codeset.CommissionTypeV2Code.CommissionDePlacement, com.tools20022.repository.codeset.CommissionTypeV2Code.BrokerCredit, com.tools20022.repository.codeset.CommissionTypeV2Code.Other,
						com.tools20022.repository.codeset.CommissionTypeV2Code.FundBasedRenewal, com.tools20022.repository.codeset.CommissionTypeV2Code.FlatFee,
						com.tools20022.repository.codeset.CommissionTypeV2Code.PointsPerBondOrContract, com.tools20022.repository.codeset.CommissionTypeV2Code.DifferentialOrDeferredPayment,
						com.tools20022.repository.codeset.CommissionTypeV2Code.BrokerageRate, com.tools20022.repository.codeset.CommissionTypeV2Code.PerUnit,
						com.tools20022.repository.codeset.CommissionTypeV2Code.PercentageCommissionWaivedAsCashDiscount, com.tools20022.repository.codeset.CommissionTypeV2Code.PercentageCommissionWaivedAsAdditionalUnits);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ClientDirected.getCodeName().get(), ClientDirected);
		codesByName.put(StepOut.getCodeName().get(), StepOut);
		codesByName.put(FrontEndLoad.getCodeName().get(), FrontEndLoad);
		codesByName.put(Initial.getCodeName().get(), Initial);
		codesByName.put(BackEndLoad.getCodeName().get(), BackEndLoad);
		codesByName.put(Trailer.getCodeName().get(), Trailer);
		codesByName.put(Regular.getCodeName().get(), Regular);
		codesByName.put(StepIn.getCodeName().get(), StepIn);
		codesByName.put(SoftDollar.getCodeName().get(), SoftDollar);
		codesByName.put(SoftDollarStepIn.getCodeName().get(), SoftDollarStepIn);
		codesByName.put(SoftDollarStepOut.getCodeName().get(), SoftDollarStepOut);
		codesByName.put(PlanSponsor.getCodeName().get(), PlanSponsor);
		codesByName.put(PercentageOfPrincipal.getCodeName().get(), PercentageOfPrincipal);
		codesByName.put(Markup.getCodeName().get(), Markup);
		codesByName.put(CommissionDePlacement.getCodeName().get(), CommissionDePlacement);
		codesByName.put(BrokerCredit.getCodeName().get(), BrokerCredit);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(FundBasedRenewal.getCodeName().get(), FundBasedRenewal);
		codesByName.put(FlatFee.getCodeName().get(), FlatFee);
		codesByName.put(PointsPerBondOrContract.getCodeName().get(), PointsPerBondOrContract);
		codesByName.put(DifferentialOrDeferredPayment.getCodeName().get(), DifferentialOrDeferredPayment);
		codesByName.put(BrokerageRate.getCodeName().get(), BrokerageRate);
		codesByName.put(PerUnit.getCodeName().get(), PerUnit);
		codesByName.put(PercentageCommissionWaivedAsCashDiscount.getCodeName().get(), PercentageCommissionWaivedAsCashDiscount);
		codesByName.put(PercentageCommissionWaivedAsAdditionalUnits.getCodeName().get(), PercentageCommissionWaivedAsAdditionalUnits);
	}

	public static CommissionTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CommissionTypeV2Code[] values() {
		CommissionTypeV2Code[] values = new CommissionTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CommissionTypeV2Code> {
		@Override
		public CommissionTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CommissionTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}