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
import com.tools20022.repository.codeset.FundOrderTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the category of the investment fund order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#BedAndBreakfast
 * FundOrderTypeCode.BedAndBreakfast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#InvestmentPlan
 * FundOrderTypeCode.InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#PreAdvice
 * FundOrderTypeCode.PreAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#StaffOrder
 * FundOrderTypeCode.StaffOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#RegularSavingsPlan
 * FundOrderTypeCode.RegularSavingsPlan}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#Other
 * FundOrderTypeCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#RegularSavingsPlanUpdate
 * FundOrderTypeCode.RegularSavingsPlanUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#ReinvestmentOfDividend
 * FundOrderTypeCode.ReinvestmentOfDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#NormalStaffPortion
 * FundOrderTypeCode.NormalStaffPortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#NormalClientPortion
 * FundOrderTypeCode.NormalClientPortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#StaffWithSavingsPlan
 * FundOrderTypeCode.StaffWithSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#ClientWithSavingsPlan
 * FundOrderTypeCode.ClientWithSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#NonUnitized
 * FundOrderTypeCode.NonUnitized}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#SidePocketComponent
 * FundOrderTypeCode.SidePocketComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#SidePocketOrder
 * FundOrderTypeCode.SidePocketOrder}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#Unitized
 * FundOrderTypeCode.Unitized}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#Subscription
 * FundOrderTypeCode.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#Redemption
 * FundOrderTypeCode.Redemption}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#Switch
 * FundOrderTypeCode.Switch}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#TopUp
 * FundOrderTypeCode.TopUp}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#HoldBack
 * FundOrderTypeCode.HoldBack}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#All
 * FundOrderTypeCode.All}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#SwitchFrom
 * FundOrderTypeCode.SwitchFrom}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#SwitchTo
 * FundOrderTypeCode.SwitchTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#TransferIn
 * FundOrderTypeCode.TransferIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#TransferOut
 * FundOrderTypeCode.TransferOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#SecuritiesPurchase
 * FundOrderTypeCode.SecuritiesPurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#SecuritiesSale
 * FundOrderTypeCode.SecuritiesSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode#Withdrawal
 * FundOrderTypeCode.Withdrawal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BEDB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundOrderTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the category of the investment fund order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FundOrderTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investment fund order is part of a bed and breakfast transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BedAndBreakfast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund order is part of a bed and breakfast transaction."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode BedAndBreakfast = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BedAndBreakfast";
			definition = "Investment fund order is part of a bed and breakfast transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "BEDB";
		}
	};
	/**
	 * Investment fund order is related to an investment plan (only applicable
	 * to a subscription).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund order is related to an investment plan (only applicable to a subscription)."
	 * </li>
	 * </ul>
	 */
	public static final FundOrderTypeCode InvestmentPlan = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment fund order is related to an investment plan (only applicable to a subscription).";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "INVP";
		}
	};
	/**
	 * Investment fund order is executed with specific pre-advice conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund order is executed with specific pre-advice conditions."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode PreAdvice = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreAdvice";
			definition = "Investment fund order is executed with specific pre-advice conditions.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "PREA";
		}
	};
	/**
	 * Investment fund order is a staff order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StaffOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund order is a staff order."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode StaffOrder = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StaffOrder";
			definition = "Investment fund order is a staff order.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "STAF";
		}
	};
	/**
	 * Investment fund order is a regular savings plan (only applicable to a
	 * subscription).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RGSV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegularSavingsPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund order is a regular savings plan (only applicable to a subscription)."
	 * </li>
	 * </ul>
	 */
	public static final FundOrderTypeCode RegularSavingsPlan = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegularSavingsPlan";
			definition = "Investment fund order is a regular savings plan (only applicable to a subscription).";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "RGSV";
		}
	};
	/**
	 * Another type of investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
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
	 * definition} = "Another type of investment fund order."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode Other = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of investment fund order.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Investment fund order is paying extra money into to an existing plan
	 * (only applicable to a subscription).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RGSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegularSavingsPlanUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund order is paying extra money into to an existing plan (only applicable to a subscription)."
	 * </li>
	 * </ul>
	 */
	public static final FundOrderTypeCode RegularSavingsPlanUpdate = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegularSavingsPlanUpdate";
			definition = "Investment fund order is paying extra money into to an existing plan (only applicable to a subscription).";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "RGSU";
		}
	};
	/**
	 * Investment fund order is a dividend reinvestment (only applicable to a
	 * subscription).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentOfDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund order is a dividend reinvestment (only applicable to a subscription)."
	 * </li>
	 * </ul>
	 */
	public static final FundOrderTypeCode ReinvestmentOfDividend = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentOfDividend";
			definition = "Investment fund order is a dividend reinvestment (only applicable to a subscription).";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "RDIV";
		}
	};
	/**
	 * That part of an investment fund order attributed to a normal staff
	 * portion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSPN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NormalStaffPortion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "That part of an investment fund order attributed to a normal staff portion."
	 * </li>
	 * </ul>
	 */
	public static final FundOrderTypeCode NormalStaffPortion = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NormalStaffPortion";
			definition = "That part of an investment fund order attributed to a normal staff portion.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "NSPN";
		}
	};
	/**
	 * That part of an investment fund order attributed to a normal client
	 * portion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCPN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NormalClientPortion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "That part of an investment fund order attributed to a normal client portion."
	 * </li>
	 * </ul>
	 */
	public static final FundOrderTypeCode NormalClientPortion = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NormalClientPortion";
			definition = "That part of an investment fund order attributed to a normal client portion.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "NCPN";
		}
	};
	/**
	 * That part of an investment fund order attributed to a staff member with a
	 * savings plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StaffWithSavingsPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "That part of an investment fund order attributed to a staff member with a savings plan."
	 * </li>
	 * </ul>
	 */
	public static final FundOrderTypeCode StaffWithSavingsPlan = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StaffWithSavingsPlan";
			definition = "That part of an investment fund order attributed to a staff member with a savings plan.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "SWSP";
		}
	};
	/**
	 * That part of an investment fund order attributed to a client with a
	 * savings plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CWSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientWithSavingsPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "That part of an investment fund order attributed to a client with a savings plan."
	 * </li>
	 * </ul>
	 */
	public static final FundOrderTypeCode ClientWithSavingsPlan = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClientWithSavingsPlan";
			definition = "That part of an investment fund order attributed to a client with a savings plan.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "CWSP";
		}
	};
	/**
	 * Investment fund order is for a limited partnership instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NUNI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonUnitized"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund order is for a limited partnership instrument."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode NonUnitized = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonUnitized";
			definition = "Investment fund order is for a limited partnership instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "NUNI";
		}
	};
	/**
	 * Investment fund order contains a side pocket component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocketComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund order contains a side pocket component."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode SidePocketComponent = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocketComponent";
			definition = "Investment fund order contains a side pocket component.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "SPCM";
		}
	};
	/**
	 * Investment fund order is a side pocket order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocketOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund order is a side pocket order."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode SidePocketOrder = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocketOrder";
			definition = "Investment fund order is a side pocket order.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "SPOR";
		}
	};
	/**
	 * Investment fund order is for a unitized instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unitized"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund order is for a unitized instrument."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode Unitized = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unitized";
			definition = "Investment fund order is for a unitized instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "UNIT";
		}
	};
	/**
	 * Investment fund order is a subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund order is a subscription."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode Subscription = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			definition = "Investment fund order is a subscription.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Investment fund order is a redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund order is a redemption."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode Redemption = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			definition = "Investment fund order is a redemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Investment fund order is a switch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Switch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund order is a switch."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode Switch = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Switch";
			definition = "Investment fund order is a switch.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "SWIT";
		}
	};
	/**
	 * Investment fund order specifies a top up.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOPU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TopUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund order specifies a top up."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode TopUp = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TopUp";
			definition = "Investment fund order specifies a top up.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "TOPU";
		}
	};
	/**
	 * Investment fund order specifies a hold back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund order specifies a hold back."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode HoldBack = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBack";
			definition = "Investment fund order specifies a hold back.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "HOLD";
		}
	};
	/**
	 * All type of orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "All"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All type of orders."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode All = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "All";
			definition = "All type of orders.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "ALLL";
		}
	};
	/**
	 * Switch out or switch from.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWII"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Switch out or switch from."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode SwitchFrom = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchFrom";
			definition = "Switch out or switch from.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "SWII";
		}
	};
	/**
	 * Switch in or switch to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWIO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Switch in or switch to."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode SwitchTo = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchTo";
			definition = "Switch in or switch to.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "SWIO";
		}
	};
	/**
	 * Transfer in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer in."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode TransferIn = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIn";
			definition = "Transfer in.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "TRAI";
		}
	};
	/**
	 * Transfer out.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer out."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode TransferOut = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferOut";
			definition = "Transfer out.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "TRAO";
		}
	};
	/**
	 * Purchase of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUYI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purchase of securities."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode SecuritiesPurchase = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPurchase";
			definition = "Purchase of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "BUYI";
		}
	};
	/**
	 * Sale of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SELL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sale of securities."</li>
	 * </ul>
	 */
	public static final FundOrderTypeCode SecuritiesSale = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSale";
			definition = "Sale of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "SELL";
		}
	};
	/**
	 * Investment fund order is for a withdrawal investment plan (only
	 * applicable to a redemption).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WIDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund order is for a withdrawal investment plan (only applicable to a redemption)."
	 * </li>
	 * </ul>
	 */
	public static final FundOrderTypeCode Withdrawal = new FundOrderTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			definition = "Investment fund order is for a withdrawal investment plan (only applicable to a redemption).";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderTypeCode.mmObject();
			codeName = "WIDP";
		}
	};
	final static private LinkedHashMap<String, FundOrderTypeCode> codesByName = new LinkedHashMap<>();

	protected FundOrderTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BEDB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundOrderTypeCode";
				definition = "Specifies the category of the investment fund order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundOrderTypeCode.BedAndBreakfast, com.tools20022.repository.codeset.FundOrderTypeCode.InvestmentPlan,
						com.tools20022.repository.codeset.FundOrderTypeCode.PreAdvice, com.tools20022.repository.codeset.FundOrderTypeCode.StaffOrder, com.tools20022.repository.codeset.FundOrderTypeCode.RegularSavingsPlan,
						com.tools20022.repository.codeset.FundOrderTypeCode.Other, com.tools20022.repository.codeset.FundOrderTypeCode.RegularSavingsPlanUpdate, com.tools20022.repository.codeset.FundOrderTypeCode.ReinvestmentOfDividend,
						com.tools20022.repository.codeset.FundOrderTypeCode.NormalStaffPortion, com.tools20022.repository.codeset.FundOrderTypeCode.NormalClientPortion,
						com.tools20022.repository.codeset.FundOrderTypeCode.StaffWithSavingsPlan, com.tools20022.repository.codeset.FundOrderTypeCode.ClientWithSavingsPlan, com.tools20022.repository.codeset.FundOrderTypeCode.NonUnitized,
						com.tools20022.repository.codeset.FundOrderTypeCode.SidePocketComponent, com.tools20022.repository.codeset.FundOrderTypeCode.SidePocketOrder, com.tools20022.repository.codeset.FundOrderTypeCode.Unitized,
						com.tools20022.repository.codeset.FundOrderTypeCode.Subscription, com.tools20022.repository.codeset.FundOrderTypeCode.Redemption, com.tools20022.repository.codeset.FundOrderTypeCode.Switch,
						com.tools20022.repository.codeset.FundOrderTypeCode.TopUp, com.tools20022.repository.codeset.FundOrderTypeCode.HoldBack, com.tools20022.repository.codeset.FundOrderTypeCode.All,
						com.tools20022.repository.codeset.FundOrderTypeCode.SwitchFrom, com.tools20022.repository.codeset.FundOrderTypeCode.SwitchTo, com.tools20022.repository.codeset.FundOrderTypeCode.TransferIn,
						com.tools20022.repository.codeset.FundOrderTypeCode.TransferOut, com.tools20022.repository.codeset.FundOrderTypeCode.SecuritiesPurchase, com.tools20022.repository.codeset.FundOrderTypeCode.SecuritiesSale,
						com.tools20022.repository.codeset.FundOrderTypeCode.Withdrawal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BedAndBreakfast.getCodeName().get(), BedAndBreakfast);
		codesByName.put(InvestmentPlan.getCodeName().get(), InvestmentPlan);
		codesByName.put(PreAdvice.getCodeName().get(), PreAdvice);
		codesByName.put(StaffOrder.getCodeName().get(), StaffOrder);
		codesByName.put(RegularSavingsPlan.getCodeName().get(), RegularSavingsPlan);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(RegularSavingsPlanUpdate.getCodeName().get(), RegularSavingsPlanUpdate);
		codesByName.put(ReinvestmentOfDividend.getCodeName().get(), ReinvestmentOfDividend);
		codesByName.put(NormalStaffPortion.getCodeName().get(), NormalStaffPortion);
		codesByName.put(NormalClientPortion.getCodeName().get(), NormalClientPortion);
		codesByName.put(StaffWithSavingsPlan.getCodeName().get(), StaffWithSavingsPlan);
		codesByName.put(ClientWithSavingsPlan.getCodeName().get(), ClientWithSavingsPlan);
		codesByName.put(NonUnitized.getCodeName().get(), NonUnitized);
		codesByName.put(SidePocketComponent.getCodeName().get(), SidePocketComponent);
		codesByName.put(SidePocketOrder.getCodeName().get(), SidePocketOrder);
		codesByName.put(Unitized.getCodeName().get(), Unitized);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(Switch.getCodeName().get(), Switch);
		codesByName.put(TopUp.getCodeName().get(), TopUp);
		codesByName.put(HoldBack.getCodeName().get(), HoldBack);
		codesByName.put(All.getCodeName().get(), All);
		codesByName.put(SwitchFrom.getCodeName().get(), SwitchFrom);
		codesByName.put(SwitchTo.getCodeName().get(), SwitchTo);
		codesByName.put(TransferIn.getCodeName().get(), TransferIn);
		codesByName.put(TransferOut.getCodeName().get(), TransferOut);
		codesByName.put(SecuritiesPurchase.getCodeName().get(), SecuritiesPurchase);
		codesByName.put(SecuritiesSale.getCodeName().get(), SecuritiesSale);
		codesByName.put(Withdrawal.getCodeName().get(), Withdrawal);
	}

	public static FundOrderTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FundOrderTypeCode[] values() {
		FundOrderTypeCode[] values = new FundOrderTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FundOrderTypeCode> {
		@Override
		public FundOrderTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FundOrderTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}