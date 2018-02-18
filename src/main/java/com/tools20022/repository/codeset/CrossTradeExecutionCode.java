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
import com.tools20022.repository.codeset.CrossTradeExecutionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of cross being submitted to a market.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CrossTradeExecutionCode#Executed
 * CrossTradeExecutionCode.Executed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CrossTradeExecutionCode#PartialCancel
 * CrossTradeExecutionCode.PartialCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CrossTradeExecutionCode#PartialActive
 * CrossTradeExecutionCode.PartialActive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CrossTradeExecutionCode#ExecutedWithExisting
 * CrossTradeExecutionCode.ExecutedWithExisting}</li>
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
 * <li>"EXEC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CrossTradeExecutionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of cross being submitted to a market."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CrossTradeExecutionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies a cross trade which is executed completely or not. Both sides
	 * are treated in the same manner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CrossTradeExecutionCode
	 * CrossTradeExecutionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Executed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a cross trade which is executed completely or not. Both sides are treated in the same manner."
	 * </li>
	 * </ul>
	 */
	public static final CrossTradeExecutionCode Executed = new CrossTradeExecutionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Executed";
			definition = "Identifies a cross trade which is executed completely or not. Both sides are treated in the same manner.";
			owner_lazy = () -> com.tools20022.repository.codeset.CrossTradeExecutionCode.mmObject();
			codeName = "EXEC";
		}
	};
	/**
	 * Identifies a cross trade which is executed partially and the rest is
	 * cancelled. One side is fully executed, the other side is partially
	 * executed with the remainder being cancelled. This is equivalent to an
	 * Immediate or Cancel on the other side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CrossTradeExecutionCode
	 * CrossTradeExecutionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialCancel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a cross trade which is executed partially and the rest is cancelled. One side is fully executed, the other side is partially executed with the remainder being cancelled. This is equivalent to an Immediate or Cancel on the other side."
	 * </li>
	 * </ul>
	 */
	public static final CrossTradeExecutionCode PartialCancel = new CrossTradeExecutionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialCancel";
			definition = "Identifies a cross trade which is executed partially and the rest is cancelled. One side is fully executed, the other side is partially executed with the remainder being cancelled. This is equivalent to an Immediate or Cancel on the other side.";
			owner_lazy = () -> com.tools20022.repository.codeset.CrossTradeExecutionCode.mmObject();
			codeName = "PACA";
		}
	};
	/**
	 * Identifies a cross trade which is partially executed with the unfilled
	 * portions remaining active. One side of the cross is fully executed but
	 * the unfilled portion remains active.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CrossTradeExecutionCode
	 * CrossTradeExecutionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialActive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a cross trade which is partially executed with the unfilled portions remaining active. One side of the cross is fully executed but the unfilled portion remains active."
	 * </li>
	 * </ul>
	 */
	public static final CrossTradeExecutionCode PartialActive = new CrossTradeExecutionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialActive";
			definition = "Identifies a cross trade which is partially executed with the unfilled portions remaining active. One side of the cross is fully executed but the unfilled portion remains active.";
			owner_lazy = () -> com.tools20022.repository.codeset.CrossTradeExecutionCode.mmObject();
			codeName = "PAAC";
		}
	};
	/**
	 * Identifies a cross trade which is executed with existing orders with the
	 * same price. In the case other orders exist with the same price, the
	 * quantity of the cross is executed against the existing orders and quotes,
	 * the remainder of the cross is executed against the other side of the
	 * cross. The two sides potentially have different quantities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CrossTradeExecutionCode
	 * CrossTradeExecutionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXWI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedWithExisting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a cross trade which is executed with existing orders with the same price. In the case other orders exist with the same price, the quantity of the cross is executed against the existing orders and quotes, the remainder of the cross is executed against the other side of the cross. The two sides potentially have different quantities."
	 * </li>
	 * </ul>
	 */
	public static final CrossTradeExecutionCode ExecutedWithExisting = new CrossTradeExecutionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutedWithExisting";
			definition = "Identifies a cross trade which is executed with existing orders with the same price. In the case other orders exist with the same price, the quantity of the cross is executed against the existing orders and quotes, the remainder of the cross is executed against the other side of the cross. The two sides potentially have different quantities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CrossTradeExecutionCode.mmObject();
			codeName = "EXWI";
		}
	};
	final static private LinkedHashMap<String, CrossTradeExecutionCode> codesByName = new LinkedHashMap<>();

	protected CrossTradeExecutionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EXEC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CrossTradeExecutionCode";
				definition = "Type of cross being submitted to a market.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CrossTradeExecutionCode.Executed, com.tools20022.repository.codeset.CrossTradeExecutionCode.PartialCancel,
						com.tools20022.repository.codeset.CrossTradeExecutionCode.PartialActive, com.tools20022.repository.codeset.CrossTradeExecutionCode.ExecutedWithExisting);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Executed.getCodeName().get(), Executed);
		codesByName.put(PartialCancel.getCodeName().get(), PartialCancel);
		codesByName.put(PartialActive.getCodeName().get(), PartialActive);
		codesByName.put(ExecutedWithExisting.getCodeName().get(), ExecutedWithExisting);
	}

	public static CrossTradeExecutionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CrossTradeExecutionCode[] values() {
		CrossTradeExecutionCode[] values = new CrossTradeExecutionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CrossTradeExecutionCode> {
		@Override
		public CrossTradeExecutionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CrossTradeExecutionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}