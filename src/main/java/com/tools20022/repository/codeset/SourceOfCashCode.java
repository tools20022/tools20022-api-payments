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
import com.tools20022.repository.codeset.SourceOfCashCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the origin of cash.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode#RetirementPolicy
 * SourceOfCashCode.mmRetirementPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode#SelfEmploymentIncome
 * SourceOfCashCode.mmSelfEmploymentIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode#EmployeeIncome
 * SourceOfCashCode.mmEmployeeIncome}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SourceOfCashCode#Savings
 * SourceOfCashCode.mmSavings}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SourceOfCashCode#Gift
 * SourceOfCashCode.mmGift}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode#Inheritance
 * SourceOfCashCode.mmInheritance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode#Redemption
 * SourceOfCashCode.mmRedemption}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SourceOfCashCode#Winnings
 * SourceOfCashCode.mmWinnings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode#InsurancePremiumLiquidation
 * SourceOfCashCode.mmInsurancePremiumLiquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode#SaleOfGoods
 * SourceOfCashCode.mmSaleOfGoods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode#RealEstateSale
 * SourceOfCashCode.mmRealEstateSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode#SaleAquisitionCorporation
 * SourceOfCashCode.mmSaleAquisitionCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode#CashProceeds
 * SourceOfCashCode.mmCashProceeds}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SourceOfCashCode#Alimony
 * SourceOfCashCode.mmAlimony}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode#Compensation
 * SourceOfCashCode.mmCompensation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SourceOfCashCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the origin of cash."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SourceOfCashCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Income from a retirement policy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetirementPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income from a retirement policy."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode RetirementPolicy = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetirementPolicy";
			definition = "Income from a retirement policy.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "REPY";
		}
	};
	/**
	 * Income from self-employment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SELF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfEmploymentIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income from self-employment."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode SelfEmploymentIncome = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfEmploymentIncome";
			definition = "Income from self-employment.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "SELF";
		}
	};
	/**
	 * Employee income.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Employee income."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode EmployeeIncome = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeIncome";
			definition = "Employee income.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "EMIN";
		}
	};
	/**
	 * Income from a savings plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SVGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Savings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income from a savings plan."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode Savings = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Savings";
			definition = "Income from a savings plan.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "SVGS";
		}
	};
	/**
	 * Income was a cash gift.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GIFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gift"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income was a cash gift."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode Gift = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gift";
			definition = "Income was a cash gift.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "GIFT";
		}
	};
	/**
	 * Cash from an inheritance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INHE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inheritance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash from an inheritance."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode Inheritance = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inheritance";
			definition = "Cash from an inheritance.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "INHE";
		}
	};
	/**
	 * Redemption of an investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
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
	 * definition} = "Redemption of an investment fund."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode Redemption = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			definition = "Redemption of an investment fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Income from a cash win.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WINS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Winnings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income from a cash win."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode Winnings = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Winnings";
			definition = "Income from a cash win.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "WINS";
		}
	};
	/**
	 * Income from the liquidation of an insurance premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INLQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsurancePremiumLiquidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income from the liquidation of an insurance premium."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode InsurancePremiumLiquidation = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsurancePremiumLiquidation";
			definition = "Income from the liquidation of an insurance premium.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "INLQ";
		}
	};
	/**
	 * Sale of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SALE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleOfGoods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sale of goods."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode SaleOfGoods = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfGoods";
			definition = "Sale of goods.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "SALE";
		}
	};
	/**
	 * Income from the sale of real estate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstateSale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income from the sale of real estate."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode RealEstateSale = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstateSale";
			definition = "Income from the sale of real estate.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "REST";
		}
	};
	/**
	 * Sale and acquisition of a corporation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEAQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleAquisitionCorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sale and acquisition of a corporation."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode SaleAquisitionCorporation = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleAquisitionCorporation";
			definition = "Sale and acquisition of a corporation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "SEAQ";
		}
	};
	/**
	 * Income is cash proceeds from customers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income is cash proceeds from customers."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode CashProceeds = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashProceeds";
			definition = "Income is cash proceeds from customers.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Income as a result of alimony.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALMY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Alimony"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income as a result of alimony."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode Alimony = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Alimony";
			definition = "Income as a result of alimony.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "ALMY";
		}
	};
	/**
	 * Income is from compensation received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compensation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income is from compensation received."</li>
	 * </ul>
	 */
	public static final SourceOfCashCode Compensation = new SourceOfCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compensation";
			definition = "Income is from compensation received.";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCashCode.mmObject();
			codeName = "COMP";
		}
	};
	final static private LinkedHashMap<String, SourceOfCashCode> codesByName = new LinkedHashMap<>();

	protected SourceOfCashCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SourceOfCashCode";
				definition = "Specifies the origin of cash.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SourceOfCashCode.RetirementPolicy, com.tools20022.repository.codeset.SourceOfCashCode.SelfEmploymentIncome,
						com.tools20022.repository.codeset.SourceOfCashCode.EmployeeIncome, com.tools20022.repository.codeset.SourceOfCashCode.Savings, com.tools20022.repository.codeset.SourceOfCashCode.Gift,
						com.tools20022.repository.codeset.SourceOfCashCode.Inheritance, com.tools20022.repository.codeset.SourceOfCashCode.Redemption, com.tools20022.repository.codeset.SourceOfCashCode.Winnings,
						com.tools20022.repository.codeset.SourceOfCashCode.InsurancePremiumLiquidation, com.tools20022.repository.codeset.SourceOfCashCode.SaleOfGoods, com.tools20022.repository.codeset.SourceOfCashCode.RealEstateSale,
						com.tools20022.repository.codeset.SourceOfCashCode.SaleAquisitionCorporation, com.tools20022.repository.codeset.SourceOfCashCode.CashProceeds, com.tools20022.repository.codeset.SourceOfCashCode.Alimony,
						com.tools20022.repository.codeset.SourceOfCashCode.Compensation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RetirementPolicy.getCodeName().get(), RetirementPolicy);
		codesByName.put(SelfEmploymentIncome.getCodeName().get(), SelfEmploymentIncome);
		codesByName.put(EmployeeIncome.getCodeName().get(), EmployeeIncome);
		codesByName.put(Savings.getCodeName().get(), Savings);
		codesByName.put(Gift.getCodeName().get(), Gift);
		codesByName.put(Inheritance.getCodeName().get(), Inheritance);
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(Winnings.getCodeName().get(), Winnings);
		codesByName.put(InsurancePremiumLiquidation.getCodeName().get(), InsurancePremiumLiquidation);
		codesByName.put(SaleOfGoods.getCodeName().get(), SaleOfGoods);
		codesByName.put(RealEstateSale.getCodeName().get(), RealEstateSale);
		codesByName.put(SaleAquisitionCorporation.getCodeName().get(), SaleAquisitionCorporation);
		codesByName.put(CashProceeds.getCodeName().get(), CashProceeds);
		codesByName.put(Alimony.getCodeName().get(), Alimony);
		codesByName.put(Compensation.getCodeName().get(), Compensation);
	}

	public static SourceOfCashCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SourceOfCashCode[] values() {
		SourceOfCashCode[] values = new SourceOfCashCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SourceOfCashCode> {
		@Override
		public SourceOfCashCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SourceOfCashCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}