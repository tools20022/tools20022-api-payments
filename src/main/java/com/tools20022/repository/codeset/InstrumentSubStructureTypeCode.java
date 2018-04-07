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
import com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the type of deal for structured finance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#AssetBackedSecurity
 * InstrumentSubStructureTypeCode.AssetBackedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#AirlineTrust
 * InstrumentSubStructureTypeCode.AirlineTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#AutoTrust
 * InstrumentSubStructureTypeCode.AutoTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#CollateralBondObligation
 * InstrumentSubStructureTypeCode.CollateralBondObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#CollateralDebtObligation
 * InstrumentSubStructureTypeCode.CollateralDebtObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#CreditLinkedNotes
 * InstrumentSubStructureTypeCode.CreditLinkedNotes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#CollateralLoanObligation
 * InstrumentSubStructureTypeCode.CollateralLoanObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#CommercialMortgage
 * InstrumentSubStructureTypeCode.CommercialMortgage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#Consumer
 * InstrumentSubStructureTypeCode.Consumer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#CreditCardTrust
 * InstrumentSubStructureTypeCode.CreditCardTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#HomeEquityLoans
 * InstrumentSubStructureTypeCode.HomeEquityLoans}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#LoanParticipationNote
 * InstrumentSubStructureTypeCode.LoanParticipationNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#CoveredBond
 * InstrumentSubStructureTypeCode.CoveredBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#PaymentRight
 * InstrumentSubStructureTypeCode.PaymentRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#Repackagings
 * InstrumentSubStructureTypeCode.Repackagings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#ResidentialMortgage
 * InstrumentSubStructureTypeCode.ResidentialMortgage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#StructuredCoveredBond
 * InstrumentSubStructureTypeCode.StructuredCoveredBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#StraightBond
 * InstrumentSubStructureTypeCode.StraightBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#StudentLoanTrust
 * InstrumentSubStructureTypeCode.StudentLoanTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#WholeBusinessSecurity
 * InstrumentSubStructureTypeCode.WholeBusinessSecurity}</li>
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
 * <li>"ABSE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstrumentSubStructureTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the type of deal for structured finance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstrumentSubStructureTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Sub structured type of the financial instrument is an asset backed
	 * security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetBackedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is an asset backed security."
	 * </li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode AssetBackedSecurity = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedSecurity";
			definition = "Sub structured type of the financial instrument is an asset backed security.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "ABSE";
		}
	};
	/**
	 * Sub structured type of the financial instrument is an airline trust.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AIRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AirlineTrust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is an airline trust."</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode AirlineTrust = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AirlineTrust";
			definition = "Sub structured type of the financial instrument is an airline trust.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "AIRT";
		}
	};
	/**
	 * Sub structured type of the financial instrument is an auto trust.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoTrust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is an auto trust."</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode AutoTrust = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoTrust";
			definition = "Sub structured type of the financial instrument is an auto trust.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "AUTT";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a collateral bond
	 * obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralBondObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a collateral bond obligation."
	 * </li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode CollateralBondObligation = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralBondObligation";
			definition = "Sub structured type of the financial instrument is a collateral bond obligation.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "CBOB";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a collateral debt
	 * obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralDebtObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a collateral debt obligation."
	 * </li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode CollateralDebtObligation = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralDebtObligation";
			definition = "Sub structured type of the financial instrument is a collateral debt obligation.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "CDOB";
		}
	};
	/**
	 * Sub-structured type of the financial instrument is a credit linked note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLNO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditLinkedNotes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-structured type of the financial instrument is a credit linked note."
	 * </li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode CreditLinkedNotes = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditLinkedNotes";
			definition = "Sub-structured type of the financial instrument is a credit linked note.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "CLNO";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a collateral loan
	 * obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralLoanObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a collateral loan obligation."
	 * </li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode CollateralLoanObligation = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralLoanObligation";
			definition = "Sub structured type of the financial instrument is a collateral loan obligation.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "CLOB";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a commercial mortgage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialMortgage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a commercial mortgage."
	 * </li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode CommercialMortgage = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialMortgage";
			definition = "Sub structured type of the financial instrument is a commercial mortgage.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "CMBS";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a consumer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSMR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consumer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a consumer."</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode Consumer = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consumer";
			definition = "Sub structured type of the financial instrument is a consumer.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "CSMR";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a credit card trust.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditCardTrust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a credit card trust."
	 * </li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode CreditCardTrust = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditCardTrust";
			definition = "Sub structured type of the financial instrument is a credit card trust.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "CRCT";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a home equity loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HELO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HomeEquityLoans"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a home equity loan."</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode HomeEquityLoans = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeEquityLoans";
			definition = "Sub structured type of the financial instrument is a home equity loan.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "HELO";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a loan participation
	 * notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LPNO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LoanParticipationNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a loan participation notes."
	 * </li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode LoanParticipationNote = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LoanParticipationNote";
			definition = "Sub structured type of the financial instrument is a loan participation notes.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "LPNO";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a covered bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PFAB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a covered bond."</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode CoveredBond = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoveredBond";
			definition = "Sub structured type of the financial instrument is a covered bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "PFAB";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a payment right.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PYRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a payment right."</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode PaymentRight = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentRight";
			definition = "Sub structured type of the financial instrument is a payment right.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "PYRT";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a repackaging.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repackagings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a repackaging."</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode Repackagings = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repackagings";
			definition = "Sub structured type of the financial instrument is a repackaging.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "REPK";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a residential
	 * mortgage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResidentialMortgage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a residential mortgage."
	 * </li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode ResidentialMortgage = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidentialMortgage";
			definition = "Sub structured type of the financial instrument is a residential mortgage.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "RMBS";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a structured covered
	 * bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StructuredCoveredBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a structured covered bond."
	 * </li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode StructuredCoveredBond = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StructuredCoveredBond";
			definition = "Sub structured type of the financial instrument is a structured covered bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "SCBO";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a straight bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STRB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StraightBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a straight bond."</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode StraightBond = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StraightBond";
			definition = "Sub structured type of the financial instrument is a straight bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "STRB";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a student loan trust.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StudentLoanTrust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a student loan trust."
	 * </li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode StudentLoanTrust = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StudentLoanTrust";
			definition = "Sub structured type of the financial instrument is a student loan trust.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "STUT";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a whole business
	 * security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WBSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WholeBusinessSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub structured type of the financial instrument is a whole business security."
	 * </li>
	 * </ul>
	 */
	public static final InstrumentSubStructureTypeCode WholeBusinessSecurity = new InstrumentSubStructureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WholeBusinessSecurity";
			definition = "Sub structured type of the financial instrument is a whole business security.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.mmObject();
			codeName = "WBSE";
		}
	};
	final static private LinkedHashMap<String, InstrumentSubStructureTypeCode> codesByName = new LinkedHashMap<>();

	protected InstrumentSubStructureTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ABSE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstrumentSubStructureTypeCode";
				definition = "Indicates the type of deal for structured finance.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.AssetBackedSecurity, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.AirlineTrust,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.AutoTrust, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.CollateralBondObligation,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.CollateralDebtObligation, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.CreditLinkedNotes,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.CollateralLoanObligation, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.CommercialMortgage,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.Consumer, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.CreditCardTrust,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.HomeEquityLoans, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.LoanParticipationNote,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.CoveredBond, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.PaymentRight,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.Repackagings, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.ResidentialMortgage,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.StructuredCoveredBond, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.StraightBond,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.StudentLoanTrust, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.WholeBusinessSecurity);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AssetBackedSecurity.getCodeName().get(), AssetBackedSecurity);
		codesByName.put(AirlineTrust.getCodeName().get(), AirlineTrust);
		codesByName.put(AutoTrust.getCodeName().get(), AutoTrust);
		codesByName.put(CollateralBondObligation.getCodeName().get(), CollateralBondObligation);
		codesByName.put(CollateralDebtObligation.getCodeName().get(), CollateralDebtObligation);
		codesByName.put(CreditLinkedNotes.getCodeName().get(), CreditLinkedNotes);
		codesByName.put(CollateralLoanObligation.getCodeName().get(), CollateralLoanObligation);
		codesByName.put(CommercialMortgage.getCodeName().get(), CommercialMortgage);
		codesByName.put(Consumer.getCodeName().get(), Consumer);
		codesByName.put(CreditCardTrust.getCodeName().get(), CreditCardTrust);
		codesByName.put(HomeEquityLoans.getCodeName().get(), HomeEquityLoans);
		codesByName.put(LoanParticipationNote.getCodeName().get(), LoanParticipationNote);
		codesByName.put(CoveredBond.getCodeName().get(), CoveredBond);
		codesByName.put(PaymentRight.getCodeName().get(), PaymentRight);
		codesByName.put(Repackagings.getCodeName().get(), Repackagings);
		codesByName.put(ResidentialMortgage.getCodeName().get(), ResidentialMortgage);
		codesByName.put(StructuredCoveredBond.getCodeName().get(), StructuredCoveredBond);
		codesByName.put(StraightBond.getCodeName().get(), StraightBond);
		codesByName.put(StudentLoanTrust.getCodeName().get(), StudentLoanTrust);
		codesByName.put(WholeBusinessSecurity.getCodeName().get(), WholeBusinessSecurity);
	}

	public static InstrumentSubStructureTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstrumentSubStructureTypeCode[] values() {
		InstrumentSubStructureTypeCode[] values = new InstrumentSubStructureTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstrumentSubStructureTypeCode> {
		@Override
		public InstrumentSubStructureTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstrumentSubStructureTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}