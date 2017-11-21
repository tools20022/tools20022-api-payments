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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the type of deal for structured finance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmAssetBackedSecurity
 * InstrumentSubStructureTypeCode.mmAssetBackedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmAirlineTrust
 * InstrumentSubStructureTypeCode.mmAirlineTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmAutoTrust
 * InstrumentSubStructureTypeCode.mmAutoTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmCollateralBondObligation
 * InstrumentSubStructureTypeCode.mmCollateralBondObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmCollateralDebtObligation
 * InstrumentSubStructureTypeCode.mmCollateralDebtObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmCreditLinkedNotes
 * InstrumentSubStructureTypeCode.mmCreditLinkedNotes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmCollateralLoanObligation
 * InstrumentSubStructureTypeCode.mmCollateralLoanObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmCommercialMortgage
 * InstrumentSubStructureTypeCode.mmCommercialMortgage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmConsumer
 * InstrumentSubStructureTypeCode.mmConsumer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmCreditCardTrust
 * InstrumentSubStructureTypeCode.mmCreditCardTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmHomeEquityLoans
 * InstrumentSubStructureTypeCode.mmHomeEquityLoans}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmLoanParticipationNote
 * InstrumentSubStructureTypeCode.mmLoanParticipationNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmCoveredBond
 * InstrumentSubStructureTypeCode.mmCoveredBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmPaymentRight
 * InstrumentSubStructureTypeCode.mmPaymentRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmRepackagings
 * InstrumentSubStructureTypeCode.mmRepackagings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmResidentialMortgage
 * InstrumentSubStructureTypeCode.mmResidentialMortgage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmStructuredCoveredBond
 * InstrumentSubStructureTypeCode.mmStructuredCoveredBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmStraightBond
 * InstrumentSubStructureTypeCode.mmStraightBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmStudentLoanTrust
 * InstrumentSubStructureTypeCode.mmStudentLoanTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode#mmWholeBusinessSecurity
 * InstrumentSubStructureTypeCode.mmWholeBusinessSecurity}</li>
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
public class InstrumentSubStructureTypeCode {

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
	public static final MMCode mmAssetBackedSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedSecurity";
			definition = "Sub structured type of the financial instrument is an asset backed security.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
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
	public static final MMCode mmAirlineTrust = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AirlineTrust";
			definition = "Sub structured type of the financial instrument is an airline trust.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
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
	public static final MMCode mmAutoTrust = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoTrust";
			definition = "Sub structured type of the financial instrument is an auto trust.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
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
	public static final MMCode mmCollateralBondObligation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralBondObligation";
			definition = "Sub structured type of the financial instrument is a collateral bond obligation.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
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
	public static final MMCode mmCollateralDebtObligation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralDebtObligation";
			definition = "Sub structured type of the financial instrument is a collateral debt obligation.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
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
	public static final MMCode mmCreditLinkedNotes = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditLinkedNotes";
			definition = "Sub-structured type of the financial instrument is a credit linked note.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
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
	public static final MMCode mmCollateralLoanObligation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralLoanObligation";
			definition = "Sub structured type of the financial instrument is a collateral loan obligation.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
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
	public static final MMCode mmCommercialMortgage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialMortgage";
			definition = "Sub structured type of the financial instrument is a commercial mortgage.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
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
	public static final MMCode mmConsumer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consumer";
			definition = "Sub structured type of the financial instrument is a consumer.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "CSMR";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a credit card trust .
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
	 * "Sub structured type of the financial instrument is a credit card trust ."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCreditCardTrust = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditCardTrust";
			definition = "Sub structured type of the financial instrument is a credit card trust .";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
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
	public static final MMCode mmHomeEquityLoans = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeEquityLoans";
			definition = "Sub structured type of the financial instrument is a home equity loan.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "HELO";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a loan participation
	 * notes .
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
	 * "Sub structured type of the financial instrument is a loan participation notes ."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLoanParticipationNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LoanParticipationNote";
			definition = "Sub structured type of the financial instrument is a loan participation notes .";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
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
	public static final MMCode mmCoveredBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoveredBond";
			definition = "Sub structured type of the financial instrument is a covered bond.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
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
	public static final MMCode mmPaymentRight = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentRight";
			definition = "Sub structured type of the financial instrument is a payment right.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
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
	public static final MMCode mmRepackagings = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repackagings";
			definition = "Sub structured type of the financial instrument is a repackaging.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "REPK";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a residential mortgage
	 * .
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
	 * "Sub structured type of the financial instrument is a residential mortgage ."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmResidentialMortgage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidentialMortgage";
			definition = "Sub structured type of the financial instrument is a residential mortgage .";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "RMBS";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a structured covered
	 * bond .
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
	 * "Sub structured type of the financial instrument is a structured covered bond ."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStructuredCoveredBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StructuredCoveredBond";
			definition = "Sub structured type of the financial instrument is a structured covered bond .";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
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
	public static final MMCode mmStraightBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StraightBond";
			definition = "Sub structured type of the financial instrument is a straight bond.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "STRB";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a student loan trust .
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
	 * "Sub structured type of the financial instrument is a student loan trust ."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStudentLoanTrust = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StudentLoanTrust";
			definition = "Sub structured type of the financial instrument is a student loan trust .";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "STUT";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a whole business
	 * security .
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
	 * "Sub structured type of the financial instrument is a whole business security ."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWholeBusinessSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WholeBusinessSecurity";
			definition = "Sub structured type of the financial instrument is a whole business security .";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "WBSE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ABSE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstrumentSubStructureTypeCode";
				definition = "Indicates the type of deal for structured finance.";
				code_lazy = () -> Arrays.asList(InstrumentSubStructureTypeCode.mmAssetBackedSecurity, InstrumentSubStructureTypeCode.mmAirlineTrust, InstrumentSubStructureTypeCode.mmAutoTrust,
						InstrumentSubStructureTypeCode.mmCollateralBondObligation, InstrumentSubStructureTypeCode.mmCollateralDebtObligation, InstrumentSubStructureTypeCode.mmCreditLinkedNotes,
						InstrumentSubStructureTypeCode.mmCollateralLoanObligation, InstrumentSubStructureTypeCode.mmCommercialMortgage, InstrumentSubStructureTypeCode.mmConsumer, InstrumentSubStructureTypeCode.mmCreditCardTrust,
						InstrumentSubStructureTypeCode.mmHomeEquityLoans, InstrumentSubStructureTypeCode.mmLoanParticipationNote, InstrumentSubStructureTypeCode.mmCoveredBond, InstrumentSubStructureTypeCode.mmPaymentRight,
						InstrumentSubStructureTypeCode.mmRepackagings, InstrumentSubStructureTypeCode.mmResidentialMortgage, InstrumentSubStructureTypeCode.mmStructuredCoveredBond, InstrumentSubStructureTypeCode.mmStraightBond,
						InstrumentSubStructureTypeCode.mmStudentLoanTrust, InstrumentSubStructureTypeCode.mmWholeBusinessSecurity);
			}
		});
		return mmObject_lazy.get();
	}
}