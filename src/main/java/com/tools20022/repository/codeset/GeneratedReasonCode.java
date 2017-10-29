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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason why the transaction was generated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode#CollateralManagement
 * GeneratedReasonCode.CollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode#ReturnRefusedDumps
 * GeneratedReasonCode.ReturnRefusedDumps}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode#SplitShaping
 * GeneratedReasonCode.SplitShaping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode#ThirdParty
 * GeneratedReasonCode.ThirdParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode#Transformation
 * GeneratedReasonCode.Transformation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.GeneratedReasonCode#Other
 * GeneratedReasonCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode#MarketClaim
 * GeneratedReasonCode.MarketClaim}</li>
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
 * <li>"COLL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GeneratedReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason why the transaction was generated."</li>
 * </ul>
 */
public class GeneratedReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction has been generated for collateral management purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been generated for collateral management purposes."</li>
	 * </ul>
	 */
	public static final MMCode CollateralManagement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Transaction has been generated for collateral management purposes.";
			owner_lazy = () -> GeneratedReasonCode.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Relates to the return of financial instruments resulting from a rejected
	 * delivery without matching operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RODE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnRefusedDumps"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the return of financial instruments resulting from a rejected delivery without matching operation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ReturnRefusedDumps = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnRefusedDumps";
			definition = "Relates to the return of financial instruments resulting from a rejected delivery without matching operation.";
			owner_lazy = () -> GeneratedReasonCode.mmObject();
			codeName = "RODE";
		}
	};
	/**
	 * Transaction has been generated to enable settlement following a shortage
	 * of position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitShaping"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been generated to enable settlement following a shortage of position."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SplitShaping = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitShaping";
			definition = "Transaction has been generated to enable settlement following a shortage of position.";
			owner_lazy = () -> GeneratedReasonCode.mmObject();
			codeName = "SPLI";
		}
	};
	/**
	 * Transaction has been generated by a third party, for example, a central
	 * counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been generated by a third party, for example, a central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ThirdParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdParty";
			definition = "Transaction has been generated by a third party, for example, a central counterparty.";
			owner_lazy = () -> GeneratedReasonCode.mmObject();
			codeName = "THRD";
		}
	};
	/**
	 * Transaction has been generated due to transformation following a
	 * corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been generated due to transformation following a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Transformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transformation";
			definition = "Transaction has been generated due to transformation following a corporate action.";
			owner_lazy = () -> GeneratedReasonCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Other. See Narrative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other. See Narrative."</li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> GeneratedReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Transaction resulting from a market claim.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction resulting from a market claim."</li>
	 * </ul>
	 */
	public static final MMCode MarketClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaim";
			definition = "Transaction resulting from a market claim.";
			owner_lazy = () -> GeneratedReasonCode.mmObject();
			codeName = "CLAI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("COLL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GeneratedReasonCode";
				definition = "Specifies the reason why the transaction was generated.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GeneratedReasonCode.CollateralManagement, com.tools20022.repository.codeset.GeneratedReasonCode.ReturnRefusedDumps,
						com.tools20022.repository.codeset.GeneratedReasonCode.SplitShaping, com.tools20022.repository.codeset.GeneratedReasonCode.ThirdParty, com.tools20022.repository.codeset.GeneratedReasonCode.Transformation,
						com.tools20022.repository.codeset.GeneratedReasonCode.Other, com.tools20022.repository.codeset.GeneratedReasonCode.MarketClaim);
			}
		});
		return mmObject_lazy.get();
	}
}