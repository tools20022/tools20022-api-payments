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
import com.tools20022.repository.codeset.ProcessingPositionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies when an transaction/instruction is to be executed relative to a
 * linked transaction/instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPositionCode#After
 * ProcessingPositionCode.After}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPositionCode#With
 * ProcessingPositionCode.With}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPositionCode#Before
 * ProcessingPositionCode.Before}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPositionCode#Information
 * ProcessingPositionCode.Information}</li>
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
 * <li>"AFTE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessingPositionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies when an transaction/instruction is to be executed relative to a linked transaction/instruction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProcessingPositionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the transaction/instruction is to be executed after the
	 * linked transaction/instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPositionCode
	 * ProcessingPositionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AFTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "After"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the transaction/instruction is to be executed after the linked transaction/instruction."
	 * </li>
	 * </ul>
	 */
	public static final ProcessingPositionCode After = new ProcessingPositionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "After";
			definition = "Specifies that the transaction/instruction is to be executed after the linked transaction/instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingPositionCode.mmObject();
			codeName = "AFTE";
		}
	};
	/**
	 * Specifies that the transaction/instruction is to be executed with the
	 * linked transaction/instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPositionCode
	 * ProcessingPositionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "With"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the transaction/instruction is to be executed with the linked transaction/instruction."
	 * </li>
	 * </ul>
	 */
	public static final ProcessingPositionCode With = new ProcessingPositionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "With";
			definition = "Specifies that the transaction/instruction is to be executed with the linked transaction/instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingPositionCode.mmObject();
			codeName = "WITH";
		}
	};
	/**
	 * Specifies that the transaction/instruction is to be executed before the
	 * linked transaction/instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPositionCode
	 * ProcessingPositionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Before"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the transaction/instruction is to be executed before the linked transaction/instruction."
	 * </li>
	 * </ul>
	 */
	public static final ProcessingPositionCode Before = new ProcessingPositionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Before";
			definition = "Specifies that the transaction/instruction is to be executed before the linked transaction/instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingPositionCode.mmObject();
			codeName = "BEFO";
		}
	};
	/**
	 * Specifies that the transactions/instructions are linked for information
	 * purposes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPositionCode
	 * ProcessingPositionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Information"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the transactions/instructions are linked for information purposes only."
	 * </li>
	 * </ul>
	 */
	public static final ProcessingPositionCode Information = new ProcessingPositionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			definition = "Specifies that the transactions/instructions are linked for information purposes only.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingPositionCode.mmObject();
			codeName = "INFO";
		}
	};
	final static private LinkedHashMap<String, ProcessingPositionCode> codesByName = new LinkedHashMap<>();

	protected ProcessingPositionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AFTE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingPositionCode";
				definition = "Specifies when an transaction/instruction is to be executed relative to a linked transaction/instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProcessingPositionCode.After, com.tools20022.repository.codeset.ProcessingPositionCode.With, com.tools20022.repository.codeset.ProcessingPositionCode.Before,
						com.tools20022.repository.codeset.ProcessingPositionCode.Information);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(After.getCodeName().get(), After);
		codesByName.put(With.getCodeName().get(), With);
		codesByName.put(Before.getCodeName().get(), Before);
		codesByName.put(Information.getCodeName().get(), Information);
	}

	public static ProcessingPositionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProcessingPositionCode[] values() {
		ProcessingPositionCode[] values = new ProcessingPositionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProcessingPositionCode> {
		@Override
		public ProcessingPositionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProcessingPositionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}