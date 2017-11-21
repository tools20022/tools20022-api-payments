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
 * Type of business process model used to carry out the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#mmTripartiteCentralMatching
 * BusinessProcessTypeCode.mmTripartiteCentralMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#mmNotCoveredByInvestmentInstructions
 * BusinessProcessTypeCode.mmNotCoveredByInvestmentInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#mmPreAccepted
 * BusinessProcessTypeCode.mmPreAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#mmReversal
 * BusinessProcessTypeCode.mmReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#mmOwnAccountTradeType
 * BusinessProcessTypeCode.mmOwnAccountTradeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#mmThroughType
 * BusinessProcessTypeCode.mmThroughType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#mmBillateralCentralMatching
 * BusinessProcessTypeCode.mmBillateralCentralMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#mmDuplexType
 * BusinessProcessTypeCode.mmDuplexType}</li>
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
 * <li>"ISUP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessProcessTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of business process model used to carry out the transaction."</li>
 * </ul>
 */
public class BusinessProcessTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the processing of a transaction in a central matching utility
	 * model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartiteCentralMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing of a transaction in a  central matching utility model."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTripartiteCentralMatching = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartiteCentralMatching";
			definition = "Specifies the processing of a transaction in a  central matching utility model.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "ISUP";
		}
	};
	/**
	 * Specifies the processing of a transaction in a local matching model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCoveredByInvestmentInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing of a transaction in a local matching model."</li>
	 * </ul>
	 */
	public static final MMCode mmNotCoveredByInvestmentInstructions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCoveredByInvestmentInstructions";
			definition = "Specifies the processing of a transaction in a local matching model.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "NISP";
		}
	};
	/**
	 * Transaction notice results from an agreement made out of a trading
	 * platform between two members (broker and intermediary) of an authorised
	 * entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction notice results from an agreement made out of a trading platform between two members (broker and intermediary) of an authorised entity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPreAccepted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAccepted";
			definition = "Transaction notice results from an agreement made out of a trading platform between two members (broker and intermediary) of an authorised entity.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "PRAC";
		}
	};
	/**
	 * Transaction notice reverses a previously sent and agreed transaction
	 * notice. If the reversal transaction notice is stated to serve as invoice:<br>
	 * o Fees and taxes contained in the transaction notice are considered as
	 * being in debit of the broker’s account and in credit of the
	 * intermediary’s account: it is a ‘credit invoice’;<br>
	 * o The broker will have to specify the original transaction notice
	 * reference;<br>
	 * o The reversal transaction notice will have the same direction (buy,
	 * sell) as the original transaction notice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction notice reverses a previously sent and agreed transaction notice. If the reversal transaction notice is stated to serve as invoice:\r\no Fees and taxes contained in the transaction notice are considered as being in debit of the broker’s account and in credit of the intermediary’s account: it is a ‘credit invoice’;\r\no The broker will have to specify the original transaction notice reference;\r\no The reversal transaction notice will have the same direction (buy, sell) as the original transaction notice."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReversal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversal";
			definition = "Transaction notice reverses a previously sent and agreed transaction notice. If the reversal transaction notice is stated to serve as invoice:\r\no Fees and taxes contained in the transaction notice are considered as being in debit of the broker’s account and in credit of the intermediary’s account: it is a ‘credit invoice’;\r\no The broker will have to specify the original transaction notice reference;\r\no The reversal transaction notice will have the same direction (buy, sell) as the original transaction notice.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "RSAL";
		}
	};
	/**
	 * Specifies the processing of a transaction in a own account trade type
	 * model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnAccountTradeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing of a transaction in a own account trade type model."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOwnAccountTradeType = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnAccountTradeType";
			definition = "Specifies the processing of a transaction in a own account trade type model.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * Specifies the processing of a transaction in a through type model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THRU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThroughType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing of a transaction in a through type model."</li>
	 * </ul>
	 */
	public static final MMCode mmThroughType = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThroughType";
			definition = "Specifies the processing of a transaction in a through type model.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "THRU";
		}
	};
	/**
	 * Specifies the processing of a transaction in a billateral central
	 * matching model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDEL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillateralCentralMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing of a transaction in a billateral central matching model."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBillateralCentralMatching = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillateralCentralMatching";
			definition = "Specifies the processing of a transaction in a billateral central matching model.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "IDEL";
		}
	};
	/**
	 * Specifies the processing of a transaction in a duplex type model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPLX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplexType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing of a transaction in a duplex type model."</li>
	 * </ul>
	 */
	public static final MMCode mmDuplexType = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplexType";
			definition = "Specifies the processing of a transaction in a duplex type model.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "DPLX";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ISUP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessProcessTypeCode";
				definition = "Type of business process model used to carry out the transaction.";
				code_lazy = () -> Arrays.asList(BusinessProcessTypeCode.mmTripartiteCentralMatching, BusinessProcessTypeCode.mmNotCoveredByInvestmentInstructions, BusinessProcessTypeCode.mmPreAccepted, BusinessProcessTypeCode.mmReversal,
						BusinessProcessTypeCode.mmOwnAccountTradeType, BusinessProcessTypeCode.mmThroughType, BusinessProcessTypeCode.mmBillateralCentralMatching, BusinessProcessTypeCode.mmDuplexType);
			}
		});
		return mmObject_lazy.get();
	}
}